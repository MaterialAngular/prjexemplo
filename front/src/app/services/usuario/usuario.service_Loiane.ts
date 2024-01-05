import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Usuarios } from 'src/app/interfaces/usuarios';
import { tap } from 'rxjs/operators';
import { first } from 'rxjs'

@Injectable({
  providedIn: 'root'
})

export class UsuarioService{

  private readonly API = '../../../assets/data/usuarios.json';

  constructor(private httpClient: HttpClient){


  }

  listUsuarios(){
   // return [ {codigo: 1, nome:'Thales', login: 'tah', senha:'123'}];

    return this.httpClient.get<Usuarios[]>(this.API)
    .pipe(
        first(),
        tap(listUsuarios => console.log(this.listUsuarios))
    );
  }


  getAllUsuarios(){
   // return this.listUsuarios.slice();
  }

  apagarUsuario(index: number){
   // this.listUsuarios.splice(index, 1);
  }

  OnSalvarUsuario(usuario: Usuarios){
   // this.listUsuarios.unshift(usuario);
  }
}
