import { Injectable } from '@angular/core';
import { ColecionadorModel } from '../../model/colecionador.model';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ColecionadorService {


  constructor(public httpClient: HttpClient) { }

  public getColecionadorById(id: Number) {
    return this.httpClient.get<ColecionadorModel>(`http://localhost:8080/colecionador/${id}`);
  }
  public findAll() {
    return this.httpClient.get<ColecionadorModel[]>("http://localhost:8080/colecionador");
  }

  public findCarroByColecionadorId(id: Number) {
    return this.httpClient.get<ColecionadorModel[]>(`http://localhost:8080/carro/colecionador/${id}`)
  }
}
