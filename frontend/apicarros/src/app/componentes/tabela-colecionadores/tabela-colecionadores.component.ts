import { Colecionador } from './../../../app/model/colecionador.model';
import { Component, OnInit } from '@angular/core';

const ELEMENT_DATA: Colecionador[] = [
  { nome: "Teste", sobrenome: "Teste", nickname: 'Teste' },
];

@Component({
  selector: 'tabela-colecionadores',
  templateUrl: './tabela-colecionadores.component.html',
  styleUrl: './tabela-colecionadores.component.css'
})

export class TabelaColecionadoresComponent implements OnInit {
  displayedColumns: string[] = ['Nome', 'Sobrenome', 'Nickname'];
  dataSource = ELEMENT_DATA;
  colecionadores: Colecionador[] = [];

  ngOnInit(): void {

  }
}
