import { Component, OnInit } from '@angular/core';
import { ColecionadorService } from './../../services/colecionador/colecionador.service';
import { CarroService } from '../../services/carro/carro.service';
import { ColecionadorModel } from '../../model/colecionador.model';
import { ActivatedRoute, Router } from '@angular/router';
import { CarroModel } from '../../model/carro.model';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent implements OnInit {
  colecionador?: ColecionadorModel[];
  carro?: CarroModel[];

  constructor(private colecionadorService: ColecionadorService, private carroService: CarroService, private router: Router, private route: ActivatedRoute) {

  }

  ngOnInit(): void {

    let idColecionador = this.route.snapshot.params["id"];
    this.colecionadorService.getColecionadorById(idColecionador).subscribe(response => {
      this.colecionador = [response];
    });

    this.carroService.getCarrosByColecionadorId(idColecionador).subscribe(response => {
      this.carro = response;
    });
  }

  redirectTocarsCollector(idColecionador:any) {
    this.router.navigate(["carsCollector", idColecionador]);
  }
}
