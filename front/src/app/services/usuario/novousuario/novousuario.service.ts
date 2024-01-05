import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class NovoUsuarioService {

  private API_SERVER = "http://localhost:8080/novousuario/";

  constructor(
    private HttpClient: HttpClient
  ) { }

  public salvarUsuario (idUsuario:any): Observable<any>{
    return this.HttpClient.post( this.API_SERVER, idUsuario);
  }
  
}
