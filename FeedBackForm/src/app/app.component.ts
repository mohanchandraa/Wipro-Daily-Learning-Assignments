import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { FeedbackComponent } from './feedback/feedback.component';
import { MovieComponent } from './movie/movie.component';
import { MusicComponent } from "./music/music.component";

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, FeedbackComponent, MovieComponent, MusicComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'FeedBackForm';
}
