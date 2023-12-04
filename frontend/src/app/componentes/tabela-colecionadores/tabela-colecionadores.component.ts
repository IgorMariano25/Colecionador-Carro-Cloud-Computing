import { ColecionadorModel } from './../../../app/model/colecionador.model';
import { Component} from '@angular/core';

@Component({
  selector: 'tabela-colecionadores',
  templateUrl: './tabela-colecionadores.component.html',
  styleUrl: './tabela-colecionadores.component.css'
})

export class TabelaColecionadoresComponent {
  displayedColumns: string[] = ['Nome', 'Sobrenome', 'Nickname'];
  colecionadores: ColecionadorModel[] = [];

}
