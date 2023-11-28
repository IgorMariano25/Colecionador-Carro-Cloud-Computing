import { Component } from '@angular/core';
import { ColecionadorService } from '../../services/colecionador/colecionador.service';
import { ColecionadorModel } from '../../model/colecionador.model';

@Component({
  selector: 'app-formulario-colecionador',
  templateUrl: './formulario-colecionador.component.html',
  styleUrls: ['./formulario-colecionador.component.css']
})
export class FormularioColecionadorComponent {
  colecionador: ColecionadorModel = {
    nome: '',
    sobrenome: '',
    nickname: '',
    email: '',
    cpf: '',
    carros: []
  };

  constructor(private colecionadorService: ColecionadorService) { }

  public criarNovoColecionador() {
    const novoColecionador: ColecionadorModel = {
      nome: this.colecionador.nome as string,
      sobrenome: this.colecionador.sobrenome as string,
      nickname: this.colecionador.nickname as string,
      email: this.colecionador.email as string,
      cpf: this.colecionador.cpf as string,
      carros: []
    };

    this.colecionadorService.createColecionador(novoColecionador).subscribe(response => {
      this.colecionador = response;
      console.log('Colecionador criado com sucesso:', response);

      this.colecionador = {
        nome: '',
        sobrenome: '',
        nickname: '',
        email: '',
        cpf: '',
        carros: []
      };
    });
  }
}
