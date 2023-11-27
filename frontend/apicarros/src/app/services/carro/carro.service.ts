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
    return this.httpClient.get<CarroModel[]>("http://localhost:8080/carro");
  }

  public getCarrosById(id: any): Observable<CarroModel> {
    return this.httpClient.get<CarroModel>(`http://localhost:8080/${id}`);
  }
  public getCarrosByColecionadorId(id: any): Observable<CarroModel[]> {
    return this.httpClient.get<CarroModel[]>(`http://localhost:8080/carro/colecionador/${id}`);
  }
}
