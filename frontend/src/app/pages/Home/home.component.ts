import { Component, OnInit } from '@angular/core';
import { ColecionadorModel } from '../../model/colecionador.model';
import { CarroModel } from '../../model/carro.model';
import { AppComponent } from '../../app.component';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})

export class HomeComponent extends AppComponent implements OnInit {
  colecionador?: ColecionadorModel[];
  carro?: CarroModel[];

  override ngOnInit() {
    this.visibilityService.setShowFooter(false);
  }

  ngOnDestroy() {
    this.visibilityService.setShowFooter(true);
  }
}
