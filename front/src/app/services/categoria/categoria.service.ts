import { Injectable } from '@angular/core';
import { Categoria } from 'src/app/interfaces/categorias';

@Injectable({
  providedIn: 'root'
})

export class CategoriaService {

  listCategorias: Categoria[] = [
    {codigo: 1, descricao: 'Fruta'},
    {codigo: 2, descricao: 'Verdura'},
    {codigo: 3, descricao: 'Legume'},
    {codigo: 4, descricao: 'Frigorífico'},

  ];

  constructor() {

  }

  getAllCategorias(){
    return this.listCategorias.slice();
  }

  apagarCategoria(index: number){
    this.listCategorias.splice(index, 1);
  }

  OnSalvarCategoria(categoria: Categoria){
    this.listCategorias.unshift(categoria);
  }
}
