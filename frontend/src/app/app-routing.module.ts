import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AllCarsComponent } from './pages/AllCars/all-cars.component'
import { CarrosColecionadorComponent } from './pages/CarrosColecionador/carros-colecionador.component'
import { HomeComponent } from './pages/Home/home.component';
import { ColecionadoresComponent } from './pages/Colecionadores/colecionadores.component';
import { FormularioColecionadorComponent } from './pages/Formularios/FormularioColecionador/formulario-colecionador.component';
import { FormularioCarroComponent } from './pages/Formularios/FormularioCarro/formulario-carro.component';
import { FormularioContatoComponent } from './pages/Formularios/FormularioContato/formulario-contato.component';
import { AboutComponent } from './pages/AboutCompany/about.component';
import { EncontrosComponent } from './pages/Encontros/encontros.component';
import { PoliticaPrivacidadeComponent } from './pages/PoliticaDePrivacidade/politica-privacidade.component';
import { TemosUsoComponent } from './pages/TermosDeUso/temos-uso.component';
import { LgpdComponent } from './pages/LPGD/lgpd.component';
import { EmpregosECarreirasComponent } from './pages/EmpregosECarreias/empregos-ecarreiras.component';

const routes: Routes = [
  { path: "", component: HomeComponent },
  { path: "allCars", component: AllCarsComponent },
  { path: "carsCollector/:id", component: CarrosColecionadorComponent },
  { path: "Colecionadores", component: ColecionadoresComponent },
  { path: "FormularioColecionador", component: FormularioColecionadorComponent },
  { path: "FormularioCarro", component: FormularioCarroComponent },
  { path: "FormularioContato", component: FormularioContatoComponent },
  { path: "About/:id", component: AboutComponent },
  { path: "About", component: AboutComponent },
  { path: "Encontros", component: EncontrosComponent },
  { path: "empregos", component: EmpregosECarreirasComponent },
  { path: "politica-privacidade", component: PoliticaPrivacidadeComponent },
  { path: "termos-uso", component: TemosUsoComponent },
  { path: "lgpd", component: LgpdComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
