import {Component, OnDestroy, OnInit} from '@angular/core';
import Phaser from 'phaser';
import GameScene from './game-scene'; // ton fichier de scène Phaser

@Component({
  selector: 'app-game',
  standalone: true,
  templateUrl: './game.html',
  styleUrls: ['./game.scss']
})
export class GameComponent implements OnInit, OnDestroy {
  private game!: Phaser.Game;

  ngOnInit(): void {
    const config: Phaser.Types.Core.GameConfig = {
      type: Phaser.AUTO,
      width: 600,   // 30 tuiles × 16px
      height: 400,  // 20 tuiles × 16px
      zoom: 1.6,      // agrandit tout ×2 pour que ce soit lisible
      parent: 'game-container', // l'id de ta div dans le HTML
      scene: [GameScene],
      pixelArt: true, // important pour les tilesets pixel art, évite le flou
      physics: {
        default: 'arcade',
        arcade: {debug: false}
      }
    };

    this.game = new Phaser.Game(config);
  }

  ngOnDestroy(): void {
    // Détruit l'instance Phaser quand on quitte le composant
    if (this.game) {
      this.game.destroy(true);
    }
  }
}
