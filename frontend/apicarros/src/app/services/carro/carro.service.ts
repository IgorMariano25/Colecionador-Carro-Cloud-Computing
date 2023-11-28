import { Injectable } from '@angular/core';
import { CarroModel } from '../../model/carro.model';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CarroService {

  constructor(private httpClient: HttpClient) { }

  public getCarros(): Observable<CarroModel[]> {
    return this.httpClient.get<CarroModel[]>("https://deploy-ap1-cloud-computing-2023-2.azurewebsites.net/carro");
  }

  public getCarrosById(id: any): Observable<CarroModel> {
    return this.httpClient.get<CarroModel>(`https://deploy-ap1-cloud-computing-2023-2.azurewebsites.net/${id}`);
  }
  public findCarroByColecionadorId(id: any): Observable<CarroModel[]> {
    return this.httpClient.get<CarroModel[]>(`https://deploy-ap1-cloud-computing-2023-2.azurewebsites.net/carro/colecionador/${id}`);
  }
}
