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
import { ImprensaComponent } from './pages/Imprensa/imprensa.component';
import { SustentabilidadeComponent } from './pages/Sustentabilidade/sustentabilidade.component';
import { ComplianceComponent } from './pages/Compliance/compliance.component';
import { EstudantesComponent } from './pages/EmpregosECarreias/Estudantes/estudantes.component';
import { ProfissionaisComponent } from './pages/EmpregosECarreias/Profissionais/profissionais.component';
import { TeseComponent } from './pages/EmpregosECarreias/Estudantes/Tese/tese.component';
import { DoutoradoComponent } from './pages/EmpregosECarreias/Estudantes/Doutorado/doutorado.component';
import { CandidaturaComponent } from './pages/EmpregosECarreias/Candidatura/candidatura.component';

const routes: Routes = [
  { path: "", component: HomeComponent },
  { path: "allCars", component: AllCarsComponent },
  { path: "carsCollector/:id", component: CarrosColecionadorComponent },
  { path: "Colecionadores", component: ColecionadoresComponent },
  { path: "FormularioColecionador", component: FormularioColecionadorComponent },
  { path: "FormularioCarro", component: FormularioCarroComponent },
  { path: "FormularioContato", component: FormularioContatoComponent },
  { path: "About", component: AboutComponent },
  { path: "Encontros", component: EncontrosComponent },
  { path: "empregos", component: EmpregosECarreirasComponent },
  { path: "empregos/candidatura", component: CandidaturaComponent },
  { path: "empregos/profissionais", component: ProfissionaisComponent },
  { path: "empregos/estudantes", component: EstudantesComponent },
  { path: "empregos/estudantes/doutorado", component: DoutoradoComponent },
  { path: "empregos/estudantes/tese", component: TeseComponent },
  { path: "politica-privacidade", component: PoliticaPrivacidadeComponent },
  { path: "termos-uso", component: TemosUsoComponent },
  { path: "lgpd", component: LgpdComponent },
  { path: "imprensa", component: ImprensaComponent },
  { path: "sustentabilidade", component: SustentabilidadeComponent },
  { path: "compliance", component: ComplianceComponent },
  { path: "compliance/denuncia", component: ComplianceComponent },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
