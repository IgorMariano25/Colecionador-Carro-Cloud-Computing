import { Component, OnInit } from '@angular/core';
import { ColecionadorModel } from '../../model/colecionador.model';
import { CarroModel } from '../../model/carro.model';
import { VisibilityService } from '../../services/VisibilityService/visibility.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent implements OnInit {
  colecionador?: ColecionadorModel[];
  carro?: CarroModel[];

  constructor(private visibilityService: VisibilityService) { }

  ngOnInit() {
    this.visibilityService.setShowFooter(false);
  }

  ngOnDestroy() {
    this.visibilityService.setShowFooter(true);
  }
}
