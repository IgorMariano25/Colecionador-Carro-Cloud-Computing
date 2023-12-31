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

  public openPopUp() {
    let popup = document.querySelector(".popup");
    popup?.classList.add("open__popup");

    let popupBackgroundView = document.querySelector(".popup__view");
    popupBackgroundView?.classList.add("active");
  }

  public closePopUp() {
    let popup = document.querySelector(".popup");
    let popupBackgroundView = document.querySelector(".popup__view");
    popup?.classList.remove("open__popup");
    popupBackgroundView?.classList.remove("active");
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
