import { Injectable } from '@angular/core';
import { Produtos } from 'src/app/interfaces/produtos';

@Injectable({
  providedIn: 'root'
})

export class ProdutoService {

  listProdutos: Produtos[] = [
    {codigo: 1, descricao: 'Mamão', categoria: 'Fruta'},
    {codigo: 2, descricao: 'Laranja', categoria: 'Fruta'},
    {codigo: 3, descricao: 'Batata', categoria: 'Legume'},
    {codigo: 4, descricao: 'Carne de Sol', categoria: 'Frigorífico'},
  ];

  constructor() {

  }

  getAllProdutos(){
    return this.listProdutos.slice();
  }

  apagarProduto(index: number){
    this.listProdutos.splice(index, 1);
  }

  OnSalvarProduto(produto: Produtos){
    this.listProdutos.unshift(produto);
  }
}
