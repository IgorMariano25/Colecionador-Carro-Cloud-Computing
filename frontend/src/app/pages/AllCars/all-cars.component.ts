import { Component } from '@angular/core';
import { CarroService } from '../../services/carro/carro.service';
import { CarroModel } from '../../model/carro.model';

@Component({
  selector: 'app-all-cars',
  templateUrl: './all-cars.component.html',
  styleUrl: './all-cars.component.css',
})
export class AllCarsComponent {
  carros: CarroModel[] = [];

  constructor(private carroService: CarroService) {

  }

  ngOnInit(): void {
    this.carroService.getCarros().subscribe(response => {
      this.carros = response;
    });
  }
}
