import Phaser from "phaser";

const TILE_SIZE = 16;
const MOVE_DURATION = 150;

export default class GameScene extends Phaser.Scene {
  private player!: Phaser.GameObjects.Rectangle;
  private cursors!: Phaser.Types.Input.Keyboard.CursorKeys;
  private map!: Phaser.Tilemaps.Tilemap;
  private isMoving = false;
  private trainers: { x: number, y: number }[] = [];

  constructor() {
    super({key: "GameScene"});
  }

  preload() {
    this.load.tilemapTiledJSON("map", "assets/map/map.json");
    this.load.image("free_pixel_16px", "assets/map/free_pixel_16_woods.png");
  }

  create() {
    this.map = this.make.tilemap({key: "map"});
    const tileset = this.map.addTilesetImage("free_pixel_16px", "free_pixel_16px")!;

    ["mer", "mer_vagues", "sol1", "deco_sol", "deco_sol_1.5", "deco_sol_2", "deco_sol_3", "sol sureleve", "sol_sureleve_deco", "arbres", "arbres2"].forEach(name => {
      const layer = this.map.createLayer(name, tileset, 0, 0);
      if (name === "arbres") layer?.setDepth(100);
      if (name === "arbres2") layer?.setDepth(101);
    });

    // Récupération ET affichage des dresseurs (une seule fois)
    const dresseurLayer = this.map.getObjectLayer("dresseurs");
    this.trainers = dresseurLayer?.objects.map(obj => {
      const tx = Math.floor(obj.x! / TILE_SIZE);
      const ty = Math.floor((obj.y! - (obj.height || 0)) / TILE_SIZE);

      this.add.rectangle(
        (tx + 0.5) * TILE_SIZE,
        (ty + 0.5) * TILE_SIZE,
        TILE_SIZE, TILE_SIZE, 0xffff00
      ).setDepth(25);

      return {x: tx, y: ty};
    }) || [];

    // Setup Joueur (Position Tile 9,11)
    this.player = this.add.rectangle(7.5 * TILE_SIZE, 13.5 * TILE_SIZE, 14, 14, 0xff0000).setDepth(50);

    this.cameras.main
      .startFollow(this.player)
      .setBounds(0, 0, this.map.widthInPixels, this.map.heightInPixels);

    this.applyResponsiveZoom();

    this.scale.on('resize', (gameSize: Phaser.Structs.Size) => {
      this.cameras.main.setViewport(0, 0, gameSize.width, gameSize.height);
      this.applyResponsiveZoom();
    });

    this.cursors = this.input.keyboard!.createCursorKeys();
  }

  public override update() {
    if (this.isMoving) return;

    let dx = 0, dy = 0, dir = "";
    if (this.cursors.left.isDown) {
      dx = -1;
      dir = "left";
    } else if (this.cursors.right.isDown) {
      dx = 1;
      dir = "right";
    } else if (this.cursors.up.isDown) {
      dy = -1;
      dir = "up";
    } else if (this.cursors.down.isDown) {
      dy = 1;
      dir = "down";
    }

    if (dx !== 0 || dy !== 0) {
      this.tryMove(dx, dy, dir);
    }
  }

  private tryMove(dx: number, dy: number, dir: string) {
    const nextX = Math.floor(this.player.x / TILE_SIZE) + dx;
    const nextY = Math.floor(this.player.y / TILE_SIZE) + dy;

    if (this.canWalk(nextX, nextY, dir)) {
      this.isMoving = true;
      this.tweens.add({
        targets: this.player,
        x: (nextX + 0.5) * TILE_SIZE,
        y: (nextY + 0.5) * TILE_SIZE,
        duration: MOVE_DURATION,
        onComplete: () => this.isMoving = false
      });
    }
  }

  private canWalk(tx: number, ty: number, dir: string): boolean {
    // 1. Limites de map
    if (tx < 0 || tx >= this.map.width || ty < 0 || ty >= this.map.height) return false;

    // 2. Vérification exception (calcul Y uniforme avec - height)
    const exceptionLayer = this.map.getObjectLayer("exceptionCollision");
    const isException = exceptionLayer?.objects.some(obj =>
      Math.floor(obj.x! / TILE_SIZE) === tx &&
      Math.floor((obj.y! - (obj.height || 0)) / TILE_SIZE) === ty
    );
    if (isException) return true;

    // 3. Dresseurs
    if (this.trainers.some(t => t.x === tx && t.y === ty)) return false;

    // 4. Tuiles classiques (murs, etc.)
    let blocked = false;
    this.map.layers.forEach(l => {
      if (!l.tilemapLayer) return;
      const tile = l.tilemapLayer.getTileAt(tx, ty);
      const col = tile?.properties?.collisionType;
      if (col === "full") blocked = true;
      if (col === "up" && dir === "down") blocked = true;
    });

    return !blocked;
  }

  private applyResponsiveZoom() {
    const visibleWidth = this.scale.width;
    const visibleHeight = this.scale.height;

    const targetTilesWide = 20;
    const targetTilesHigh = 12;

    const zoomX = visibleWidth / (targetTilesWide * TILE_SIZE);
    const zoomY = visibleHeight / (targetTilesHigh * TILE_SIZE);

    let zoom = Math.min(zoomX, zoomY);

    zoom = Phaser.Math.Clamp(zoom, 1.5, 4);
    zoom = Math.floor(zoom * 2) / 2;

    this.cameras.main.setZoom(zoom);
  }
}
