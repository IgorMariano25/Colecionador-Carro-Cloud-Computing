import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
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
import { ColecionadoresComponent } from './pages/Colecionadores/colecionadores.component';
import { FormularioColecionadorComponent } from './pages/Formularios/FormularioColecionador/formulario-colecionador.component';
import { FormularioCarroComponent } from './pages/Formularios/FormularioCarro/formulario-carro.component';
import { HomeComponent } from './pages/Home/home.component';
import { LikeButtonComponent } from './componentes/LikeButton/like-button.component';
import { FiltroDeBuscaComponent } from './componentes/FiltroDeBusca/filtro-de-busca.component';
import { AboutComponent } from './pages/AboutCompany/about.component';
import { EncontrosComponent } from './pages/Encontros/encontros.component';
import { FooterPageComponent } from './componentes/FooterPage/footer-page.component';
import { FormularioContatoComponent } from './pages/Formularios/FormularioContato/formulario-contato.component';
import { TemosUsoComponent } from './pages/TermosDeUso/temos-uso.component';
import { PoliticaPrivacidadeComponent } from './pages/PoliticaDePrivacidade/politica-privacidade.component';
import { LgpdComponent } from './pages/LPGD/lgpd.component';
import { EmpregosECarreirasComponent } from './pages/EmpregosECarreias/empregos-ecarreiras.component';

@NgModule({
  declarations: [
    AppComponent,
    TabelaColecionadoresComponent,
    AllCarsComponent,
    CarrosColecionadorComponent,
    HomeComponent,
    ColecionadoresComponent,
    FormularioColecionadorComponent,
    LikeButtonComponent,
    FormularioCarroComponent,
    FiltroDeBuscaComponent,
    AboutComponent,
    EncontrosComponent,
    FooterPageComponent,
    FormularioContatoComponent,
    TemosUsoComponent,
    PoliticaPrivacidadeComponent,
    LgpdComponent,
    EmpregosECarreirasComponent
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
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
