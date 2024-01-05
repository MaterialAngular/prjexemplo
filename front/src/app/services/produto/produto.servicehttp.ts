import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})

export class ProdutoService {

  private API_SERVER = "http://localhost:8080/produtos/";

  constructor(
    private httpClient: HttpClient
  ) { }

  public getAllProdutos(): Observable<any>{
    return this.httpClient.get(this.API_SERVER);
  }

  public getAllProdutoByCategoria(idCategoria): Observable<any>{
    return this.httpClient.get(this.API_SERVER + idCategoria);
  }

  public saveProduto (produto:any): Observable<any>{
    return this.httpClient.post( this.API_SERVER, produto);
  }
}
