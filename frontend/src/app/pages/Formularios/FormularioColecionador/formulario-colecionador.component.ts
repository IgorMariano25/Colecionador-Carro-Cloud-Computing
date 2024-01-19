import { Component } from '@angular/core';
import { ColecionadorService } from '../../../services/colecionador/colecionador.service';
import { ColecionadorModel } from './../../../model/colecionador.model';

@Component({
  selector: 'app-formulario-colecionador',
  templateUrl: './formulario-colecionador.component.html',
  styleUrls: ['./formulario-colecionador.component.css']
})

export class FormularioColecionadorComponent extends Formularios {
  colecionador: ColecionadorModel = {
    nome: '',
    sobrenome: '',
    nickname: '',
    email: '',
    cpf: '',
    carros: []
  };

  constructor(private colecionadorService: ColecionadorService) {
    super();
  }

  public override validarFomrulario(): boolean {
    return (
      !!this.colecionador.nome &&
      !!this.colecionador.sobrenome &&
      !!this.colecionador.nickname &&
      !!this.colecionador.email &&
      !!this.colecionador.cpf
    );
  }

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
