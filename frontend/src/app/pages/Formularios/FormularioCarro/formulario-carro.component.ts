import { Component } from '@angular/core';
import { CarroModel } from '../../../model/carro.model';
import { CarroService } from '../../../services/carro/carro.service';

@Component({
  selector: 'app-formulario-carro',
  templateUrl: './formulario-carro.component.html',
  styleUrl: './formulario-carro.component.css'
})
export class FormularioCarroComponent {
  carro: CarroModel = {
    marca: '',
    modelo: '',
    cor: '',
    anoDeFabricacao: 0,
    velocidadeMaxima: 0,
    quilometragem: 0,
    urlImagemCarro: ''
  };

  constructor(private carroService: CarroService) { }

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

  public criarNovoCarro() {
    const novoCarro: CarroModel = {
      marca: this.carro.marca as string,
      modelo: this.carro.modelo as string,
      cor: this.carro.cor as string,
      anoDeFabricacao: this.carro.anoDeFabricacao as number,
      velocidadeMaxima: this.carro.velocidadeMaxima as number,
      quilometragem: this.carro.quilometragem as number,
    };

    this.carroService.createCarro(novoCarro).subscribe(response => {
      this.carro = response;

      this.carro = {
        marca: '',
        modelo: '',
        cor: '',
        anoDeFabricacao: 0,
        velocidadeMaxima: 0,
        quilometragem: 0,
        urlImagemCarro: ''
      };
    });
  }
}
