import { Component } from '@angular/core';
import { CarroService } from './services/carro/carro.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  constructor(private carroService: CarroService){ }

}
