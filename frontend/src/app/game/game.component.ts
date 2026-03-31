import {Component, OnDestroy, OnInit} from '@angular/core';
import Phaser from 'phaser';
import GameScene from './game-scene'; // ton fichier de scène Phaser
import { Battle } from './battle/battle';

@Component({
  selector: 'app-game',
  standalone: true,
  templateUrl: './game.html',
  styleUrls: ['./game.scss'],
  imports: [Battle]
})
export class GameComponent implements OnInit, OnDestroy {
  private game!: Phaser.Game;
  battle: boolean = true;

  ngOnInit(): void {
    const config: Phaser.Types.Core.GameConfig = {
      type: Phaser.AUTO,
      width: '100%',   // 30 tuiles × 16px
      height: '100%',  // 20 tuiles × 16px
      parent: 'game-container', // l'id de ta div dans le HTML
      scene: [GameScene],
      pixelArt: true, // important pour les tilesets pixel art, évite le flou
      physics: {
        default: 'arcade',
        arcade: {debug: false}
      },
      scale: {
        mode: Phaser.Scale.RESIZE,
        width: '100%',
        height: '100%',
        autoCenter: Phaser.Scale.CENTER_BOTH
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
