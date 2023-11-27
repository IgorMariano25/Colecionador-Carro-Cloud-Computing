import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { MatButtonModule } from '@angular/material/button';
import { MatCardModule } from '@angular/material/card';
import { MatIconModule } from '@angular/material/icon';
import { MatTableModule } from '@angular/material/table';
import { MatToolbarModule } from '@angular/material/toolbar';
import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { RouterModule } from '@angular/router';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TabelaColecionadoresComponent } from './componentes/tabela-colecionadores/tabela-colecionadores.component';
import { AllCarsComponent } from './pages/AllCars/all-cars.component';
import { CarrosColecionadorComponent } from './pages/CarrosColecionador/carros-colecionador.component';
import { HomeComponent } from './pages/Home/home.component';
import { ColecionadoresComponent } from './pages/Colecionadores/colecionadores.component';

@NgModule({
  declarations: [
    AppComponent,
    TabelaColecionadoresComponent,
    AllCarsComponent,
    CarrosColecionadorComponent,
    HomeComponent,
    ColecionadoresComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatToolbarModule,
    MatIconModule,
    RouterModule,
    MatTableModule,
    MatButtonModule,
    MatCardModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
