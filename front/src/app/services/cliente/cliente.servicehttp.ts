import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})

export class ClienteService {

  private API_SERVER = "http://localhost:8080/clientes/";

  constructor(
    private HttpClient: HttpClient
  ) { }

  public getById(): Observable<any>{
    return this.HttpClient.get(this.API_SERVER);
  }

  public getAllCliente(): Observable<any>{
    return this.HttpClient.get(this.API_SERVER);
  }

  public SalvarCliente (idCliente:any): Observable<any>{
    return this.HttpClient.post( this.API_SERVER, idCliente);
  }
  
}
