import { Component, OnInit, ViewChild } from '@angular/core';
import { MatPaginator } from '@angular/material/paginator';
import { MatSnackBar } from '@angular/material/snack-bar';
import { MatSort } from '@angular/material/sort';
import { MatTableDataSource } from '@angular/material/table';
import { Produtos } from 'src/app/interfaces/produtos';
import { ProdutoService } from 'src/app/services/produto/produto.service';

@Component({
  selector: 'app-produtos',
  templateUrl: './produtos.component.html',
  styleUrls: ['./produtos.component.css']
})

export class ProdutosComponent implements OnInit{

  listProdutos: Produtos [] = [];

  displayedColumns: string[] = ['codigo', 'descricao', 'categoria', 'acoes'];
  dataSource !: MatTableDataSource<any>;

  @ViewChild(MatPaginator) paginator !: MatPaginator;
  @ViewChild(MatSort) sort !: MatSort;

  constructor (private _produtoService: ProdutoService, private _snackBar: MatSnackBar){

  }

  ngOnInit(): void{
    this.carregarProdutos();
  }

  carregarProdutos(){
    this.listProdutos = this._produtoService.getAllProdutos();
    this.dataSource = new MatTableDataSource(this.listProdutos);
  }

  applyFilter(event: Event) {
    const filterValue = (event.target as HTMLInputElement).value;
    this.dataSource.filter = filterValue.trim().toLowerCase();
  }

  ngAfterViewInit() {
    this.dataSource.paginator = this.paginator;
    this.dataSource.sort = this.sort;
  }

  apagarMedico(index: number){
   // console.log(index);
   this._produtoService.apagarProduto(index);
   this.carregarProdutos();

   this._snackBar.open('Função excluído com sucesso!', 'Ok',{
    duration: 1500,
    horizontalPosition: 'center',
    verticalPosition: 'bottom'
   })
  }

}
