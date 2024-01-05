import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})

export class PedidoService {

  private API_SERVER = "http://localhost:8080/pedidos/";

  constructor(
    private HttpClient: HttpClient
  ) { }

  public getAllPedidos(): Observable<any>{
      return this.HttpClient.get(this.API_SERVER);
  }

  /*public getAllProdutos(idProduto): Observable<any>{
      return this.HttpClient.get(this.API_SERVER + idProduto);
  }*/

  public getAllProdutoByCategoria(idCategoria): Observable<any>{
    return this.HttpClient.get(this.API_SERVER + "categorias/" + idCategoria);
  }

  public getById(idCliente): Observable<any>{
    return this.HttpClient.get(this.API_SERVER  + idCliente);
  } 

  public savePedido (pedido:any): Observable<any>{
    return this.HttpClient.post( this.API_SERVER, pedido);
  }
  
}
