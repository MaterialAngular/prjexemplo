import { Component, OnInit, ViewChild } from '@angular/core';
import { MatPaginator } from '@angular/material/paginator';
import { MatSnackBar } from '@angular/material/snack-bar';
import { MatSort } from '@angular/material/sort';
import { MatTableDataSource } from '@angular/material/table';
import { Clientes } from 'src/app/interfaces/clientes';
import { ClienteService } from 'src/app/services/cliente/cliente.service';

@Component({
  selector: 'app-clientes',
  templateUrl: './clientes.component.html',
  styleUrls: ['./clientes.component.css']
})

export class ClientesComponent implements OnInit{

  listClientes: Clientes [] = [];

  displayedColumns: string[] = ['codigo', 'nome', 'cpf', 'endereco', 'acoes'];
  dataSource !: MatTableDataSource<any>;

  @ViewChild(MatPaginator) paginator !: MatPaginator;
  @ViewChild(MatSort) sort !: MatSort;

  constructor (private _clienteService: ClienteService, private _snackBar: MatSnackBar){

  }

  ngOnInit(): void{
    this.carregarClientes();
  }

  carregarClientes(){
    this.listClientes = this._clienteService.getAllClientes();
    this.dataSource = new MatTableDataSource(this.listClientes);
  }

  applyFilter(event: Event) {
    const filterValue = (event.target as HTMLInputElement).value;
    this.dataSource.filter = filterValue.trim().toLowerCase();
  }

  ngAfterViewInit() {
    this.dataSource.paginator = this.paginator;
    this.dataSource.sort = this.sort;
  }

  apagarCliente(index: number){
   // console.log(index);
   this._clienteService.apagarCliente(index);
   this.carregarClientes();

   this._snackBar.open('Cliente excluído com sucesso!', 'Ok',{
    duration: 1500,
    horizontalPosition: 'center',
    verticalPosition: 'bottom'
   })
  }

}
