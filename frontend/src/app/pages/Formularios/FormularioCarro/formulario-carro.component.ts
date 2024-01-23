import { Component } from '@angular/core';
import { CarroModel } from '../../../model/carro.model';
import { CarroService } from '../../../services/carro/carro.service';
import { ColecionadorService } from '../../../services/colecionador/colecionador.service';
import { ColecionadorModel } from './../../../model/colecionador.model';
import { Formularios } from '../formularios';

@Component({
  selector: 'app-formulario-carro',
  templateUrl: './formulario-carro.component.html',
  styleUrl: './formulario-carro.component.css'
})
export class FormularioCarroComponent extends Formularios {
  carro: CarroModel = {
    marca: '',
    modelo: '',
    cor: '',
    anoDeFabricacao: undefined,
    velocidadeMaxima: undefined,
    quilometragem: undefined,
    urlImagemCarro: ''
  };

  colecionador: ColecionadorModel = {
    nome: '',
    sobrenome: '',
    nickname: '',
    email: '',
    cpf: '',
    carros: []
  };

  constructor(private carroService: CarroService) {
    super();
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

    this.carroService.createCarro(this.colecionador, novoCarro).subscribe(response => {
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
