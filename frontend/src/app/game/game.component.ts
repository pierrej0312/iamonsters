import {Component, OnDestroy, OnInit} from '@angular/core';
import Phaser from 'phaser';
import GameScene from './game-scene'; // ton fichier de scène Phaser
import {Battle} from './battle/battle';

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
      parent: 'game-container', // l'id de la div dans le HTML
      scene: [GameScene],
      pixelArt: true,
      physics: {
        default: 'arcade',
        arcade: {debug: false}
      },
      scale: {
        mode: Phaser.Scale.RESIZE,
        autoCenter: Phaser.Scale.CENTER_BOTH,
        width: 100,
        height: 100
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
