import { Component } from '@angular/core';
import { CarroService } from '../../services/carro/carro.service';
import { ColecionadorService } from '../../services/colecionador/colecionador.service';
import { CarroModel } from '../../model/carro.model';
import { ColecionadorModel } from '../../model/colecionador.model';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-carros-colecionador',
  templateUrl: './carros-colecionador.component.html',
  styleUrl: './carros-colecionador.component.css'
})
export class CarrosColecionadorComponent {
  colecionador?: ColecionadorModel;
  carro?: CarroModel[];

  constructor(private carroService: CarroService, private colecionadorService: ColecionadorService, private route: ActivatedRoute) {

  }

  ngOnInit(): void {
    let idColecionador = this.route.snapshot.params["id"];

    this.colecionadorService.getColecionadorById(idColecionador).subscribe(response => {
      this.colecionador = response;
      console.log('Colecionador:', this.colecionador);
    });

    this.carroService.findCarroByColecionadorId(idColecionador).subscribe(response => {
      this.carro = response;
      console.log('Carros:', this.carro);
    });
  }
}


