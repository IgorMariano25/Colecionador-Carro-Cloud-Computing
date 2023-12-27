import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AllCarsComponent } from './pages/AllCars/all-cars.component'
import { CarrosColecionadorComponent } from './pages/CarrosColecionador/carros-colecionador.component'
import { HomeComponent } from './pages/Home/home.component';
import { ColecionadoresComponent } from './pages/Colecionadores/colecionadores.component';
import { FormularioColecionadorComponent } from './pages/Formularios/FormularioColecionador/formulario-colecionador.component';
import { FormularioCarroComponent } from './pages/Formularios/FormularioCarro/formulario-carro.component';
import { AboutComponent } from './pages/AboutCompany/about.component';

const routes: Routes = [
  { path: "", component: HomeComponent },
  { path: "allCars", component: AllCarsComponent },
  { path: "carsCollector/:id", component: CarrosColecionadorComponent },
  { path: "Colecionadores", component: ColecionadoresComponent },
  { path: "FormularioColecionador", component: FormularioColecionadorComponent },
  { path: "FormularioCarro", component: FormularioCarroComponent },
  { path: "About/:textoUrl", component: AboutComponent },
  { path: "About", component: AboutComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
