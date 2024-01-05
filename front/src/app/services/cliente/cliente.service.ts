import { Injectable } from '@angular/core';
import { Clientes } from 'src/app/interfaces/clientes';

@Injectable({
  providedIn: 'root'
})

export class ClienteService {

  listClientes: Clientes[] = [
    {codigo: 1, nome: 'Mauro Arthur',   cpf: '123456789', endereco: 'Av. Candido Texeira,62'},
    {codigo: 2, nome: 'Hygor Ramalho',  cpf: '987654321', endereco: 'Rua Sebastião Horlando,52'},
    {codigo: 3, nome: 'Helio Lemos',    cpf: '369852147', endereco: 'Travessa do Sapoti,63'},
    {codigo: 4, nome: 'Lilian Azevedo', cpf: '365281436', endereco: 'Rua da Esperança,20'},
    {codigo: 5, nome: 'Roberto Leite',  cpf: '369852471', endereco: 'AV. Beto Café,15'},
    {codigo: 6, nome: 'Ricardo Rocha',  cpf: '321654987', endereco: 'Av. Claudio Leite,23'},
    {codigo: 7, nome: 'Izabela Rocha',  cpf: '654987321', endereco: 'Rua Ametista,50'},
  ];

  constructor() {

  }

  getAllClientes(){
    return this.listClientes.slice();
  }

  apagarCliente(index: number){
    this.listClientes.splice(index, 1);
  }

  OnSalvarCliente(cliente: Clientes){
    this.listClientes.unshift(cliente);
  }
}
