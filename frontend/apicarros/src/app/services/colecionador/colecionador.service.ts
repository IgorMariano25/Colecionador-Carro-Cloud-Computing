import { Injectable } from '@angular/core';
import { ColecionadorModel } from '../../model/colecionador.model';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ColecionadorService {

  private readonly API = "http:localhost:8080/colecion"

  constructor(public httpClient: HttpClient) { }

  public getColecionadorById(id: Number) {
    return this.httpClient.get<ColecionadorModel>(this.API + id);
  }
  public findAll() {
    return this.httpClient.get<ColecionadorModel[]>(this.API);
  }
}
