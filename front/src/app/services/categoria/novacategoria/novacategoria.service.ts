import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class NovaCategoriaService {

  private API_SERVER = "http://localhost:8080/novacategoria/";

  constructor(
    private HttpClient: HttpClient
  ) { }

  public salvarCategoria (idCategoria:any): Observable<any>{
    return this.HttpClient.post( this.API_SERVER, idCategoria);
  }

}
