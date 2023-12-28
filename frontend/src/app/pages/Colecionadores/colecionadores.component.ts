import { Component } from '@angular/core';
import { ColecionadorService } from '../../services/colecionador/colecionador.service';
import { Router } from '@angular/router';
import { CarroService } from '../../services/carro/carro.service';

@Component({
  selector: 'app-colecionadores',
  templateUrl: './colecionadores.component.html',
  styleUrl: './colecionadores.component.css'
})
export class ColecionadoresComponent {
  carros: any;
  colecionador: any;

  constructor(
    private colecionadorService: ColecionadorService,
    private carroService: CarroService,
    private router: Router) {
  }

  ngOnInit(): void {

    this.colecionadorService?.findAll().subscribe(response => {
      this.colecionador = response;
    });
  }
  redirectTocarsCollector(id: any) {
    if (id) {
      this.carroService.findCarroByColecionadorId(id).subscribe(carros => {
        this.carros = carros;
        this.router.navigate(['/carsCollector', id]);
      });
    }
  }
  redirectToFormsAddCar() {
    this.router.navigate(['/FormularioCarro']);
  };
}
