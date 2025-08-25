import { Component } from '@angular/core';
import { AboutComponent } from './about/about.component';
import { HomeComponent } from './home/home.component';
import { ServicesComponent } from './services/services.component';
import { SigninComponent } from './signin/signin.component';
import { SignupComponent } from './signup/signup.component';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-navbar',
  imports: [AboutComponent,HomeComponent,ServicesComponent,SigninComponent,SignupComponent,FormsModule],
  templateUrl: './navbar.component.html',
  styleUrl: './navbar.component.css'
})
export class NavbarComponent {

  count:number=0;
  increment(){
    this.count++;
  }

  decrement(){
    this.count--;
  }

  result:number = 0;
  num1:number = 0;
  num2:number = 0;

  addNumbers() {
    this.result = Number(this.num1) + Number(this.num2);
  }

  subtractNumbers() {
    this.result = this.num1 - this.num2;
  }

  multiplyNumbers() {
    this.result = this.num1 * this.num2;
  }

  divideNumbers() {
      this.result = this.num1 / this.num2;
    }
}
