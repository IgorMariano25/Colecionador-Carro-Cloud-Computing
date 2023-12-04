import { Component, OnInit } from '@angular/core';
import { ColecionadorService } from './../../services/colecionador/colecionador.service';
import { CarroService } from '../../services/carro/carro.service';
import { ColecionadorModel } from '../../model/colecionador.model';
import { ActivatedRoute, Router } from '@angular/router';
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
