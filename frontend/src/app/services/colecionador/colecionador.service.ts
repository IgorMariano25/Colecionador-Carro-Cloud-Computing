import { Injectable } from '@angular/core';
import { ColecionadorModel } from '../../model/colecionador.model';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ColecionadorService {


  constructor(public httpClient: HttpClient) { }

  public getColecionadorById(id: Number) {
    return this.httpClient.get<ColecionadorModel>(`https://deploy-ap1-cloud-computing-2023-2.azurewebsites.net/colecionador/${id}`);
  }
  public findAll() {
    return this.httpClient.get<ColecionadorModel[]>("https://deploy-ap1-cloud-computing-2023-2.azurewebsites.net/colecionador");
  }

  public findCarroByColecionadorId(id: Number) {
    return this.httpClient.get<ColecionadorModel[]>(`https://deploy-ap1-cloud-computing-2023-2.azurewebsites.net/carro/colecionador/${id}`)
  }

  public createColecionador(colecionador: ColecionadorModel): Observable<ColecionadorModel> {
    return this.httpClient.post<ColecionadorModel>(`https://deploy-ap1-cloud-computing-2023-2.azurewebsites.net/colecionador`, colecionador);
  }
}
