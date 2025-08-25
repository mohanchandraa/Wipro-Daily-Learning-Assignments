import { Component } from '@angular/core';
import { MatCard, MatCardModule } from '@angular/material/card';
import {MatButtonModule} from '@angular/material/button';
import {MatIconModule} from '@angular/material/icon';

@Component({
  selector: 'app-music',
  imports: [MatButtonModule,MatCard,MatIconModule,MatCardModule],
  templateUrl: './music.component.html',
  styleUrl: './music.component.css'
})
export class MusicComponent {

}
