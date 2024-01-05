import { Injectable } from '@angular/core';
import { Usuarios } from 'src/app/interfaces/usuarios';

@Injectable({
  providedIn: 'root'
})

export class UsuarioService {

  listUsuarios: Usuarios[] = [
    {codigo: 1, nome: 'Administrador',  login: 'admin', senha: 'admin'},
    {codigo: 2, nome: 'Hygor Ramalho',  login: 'hygo',  senha: '1234'},
    {codigo: 3, nome: 'Helio Lemos',    login: 'helio', senha: '123'},
    {codigo: 4, nome: 'Lilian Azevedo', login: 'lili',  senha: '123'},
    {codigo: 5, nome: 'Roberto Leite',  login: 'beto',  senha: '123'},
    {codigo: 6, nome: 'Ricardo Rocha',  login: 'rocha', senha: '123'},
    {codigo: 7, nome: 'Izabela Rocha',  login: 'bela',  senha: '123'},
  ];

  constructor() {

  }

  getAllUsuarios(){
    return this.listUsuarios.slice();
  }

  apagarUsuario(index: number){
    this.listUsuarios.splice(index, 1);
  }

  OnSalvarUsuario(usuario: Usuarios){
    this.listUsuarios.unshift(usuario);
  }
}
