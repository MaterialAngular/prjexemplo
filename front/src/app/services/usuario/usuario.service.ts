import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class UsuarioService {

  private API_SERVER = "http://localhost:8080/usuarios/";

  constructor(
    private httpClient: HttpClient
  ) { }


  //listUsuarios(){
    // return [ {codigo: 1, nome:'Thales', login: 'tah', senha:'123'}];
   // return this.getAllUsuarios();
    /* return this.httpClient.get<Usuarios[]>(this.API)
     .pipe(
         first(),
         tap(listUsuarios => console.log(this.listUsuarios))
     );*/
   //}

  public getAllUsuarios(): Observable<any>{
    return this.httpClient.get(this.API_SERVER);
  }

  public salvarUsuario (idUsuario:any): Observable<any>{
    return this.httpClient.post( this.API_SERVER, idUsuario);
  }


}
