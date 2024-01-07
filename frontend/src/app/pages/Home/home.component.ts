import { Component, OnInit } from '@angular/core';
import { ColecionadorModel } from '../../model/colecionador.model';
import { CarroModel } from '../../model/carro.model';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent implements OnInit {
  colecionador?: ColecionadorModel[];
  carro?: CarroModel[];

  constructor() {

  }

  ngOnInit(): void {
  }
}
