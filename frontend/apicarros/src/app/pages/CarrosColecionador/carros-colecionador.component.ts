import { Component } from '@angular/core';
import { CarroService } from '../../services/carro/carro.service';
import { CarroModel } from '../../model/carro.model';

@Component({
  selector: 'app-carros-colecionador',
  templateUrl: './carros-colecionador.component.html',
  styleUrl: './carros-colecionador.component.css'
})
export class CarrosColecionadorComponent {
carros: any;
colecionadores: any;


  constructor(private carroService: CarroService) {

  }

  ngOnInit(): void {

    const id: number = this.colecionadores.id || 0;

    this.carroService.getCarrosByColecionadorId(id).subscribe(response => {
      this.carros = response;
    });

  }
}


