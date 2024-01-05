import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})

export class CategoriaService {

  private API_SERVER = "http://localhost:8080/categorias/";

  constructor(
    private HttpClient: HttpClient
  ) { }

  public getAllCategoria(): Observable<any>{
    return this.HttpClient.get(this.API_SERVER);
  }

  public SalvarCategoria (idCategoria:any): Observable<any>{
    return this.HttpClient.post( this.API_SERVER, idCategoria);
  }
  
}
