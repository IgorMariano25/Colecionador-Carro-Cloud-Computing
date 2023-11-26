import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AllCarsComponent } from './pages/AllCars/all-cars.component'
import { CarrosColecionadorComponent } from './pages/CarrosColecionador/carros-colecionador.component'
import { HomeComponent } from './pages/Home/home.component';

const routes: Routes = [
  { path: "", component: HomeComponent },
  { path: "allCars", component: AllCarsComponent },
  { path: "carsCollector", component: CarrosColecionadorComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
