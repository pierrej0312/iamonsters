import {Routes} from '@angular/router';
import {GameComponent} from './game/game.component';

export const routes: Routes = [
  {
    path: 'jouer',
    component: GameComponent
  },
  // Optionnel : redirection par défaut vers le jeu
  {
    path: '',
    redirectTo: 'jouer',
    pathMatch: 'full'
  }
];
