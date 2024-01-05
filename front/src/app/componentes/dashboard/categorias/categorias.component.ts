import { Component, OnInit, ViewChild } from '@angular/core';
import { MatPaginator } from '@angular/material/paginator';
import { MatSnackBar } from '@angular/material/snack-bar';
import { MatSort } from '@angular/material/sort';
import { MatTableDataSource } from '@angular/material/table';
import { CategoriaService } from '../../../services/categoria/categoria.service';

@Component({
  selector: 'app-categorias',
  templateUrl: './categorias.component.html',
  styleUrls: ['./categorias.component.css']
})

export class CategoriasComponent implements OnInit{

  listCategorias: any [] = [];

  displayedColumns: string[] = ['codigo', 'descricao', 'acoes'];
  dataSource !: MatTableDataSource<any>;

  @ViewChild(MatPaginator) paginator !: MatPaginator;
  @ViewChild(MatSort) sort !: MatSort;

  constructor (private _categoriaService: CategoriaService, private _snackBar: MatSnackBar){

  }

  ngOnInit(): void{
    this.carregarCategorias();
  }

  carregarCategorias(){
    this.listCategorias = this._categoriaService.getAllCategorias();
    this.dataSource = new MatTableDataSource(this.listCategorias);
  }

  applyFilter(event: Event) {
    const filterValue = (event.target as HTMLInputElement).value;
    this.dataSource.filter = filterValue.trim().toLowerCase();
  }

  ngAfterViewInit() {
    this.dataSource.paginator = this.paginator;
    this.dataSource.sort = this.sort;
  }

  apagarCategoria(index: number){
   // console.log(index);
   this._categoriaService.apagarCategoria(index);
   this.carregarCategorias();

   this._snackBar.open('Categoria excluída com sucesso!', 'Ok',{
    duration: 1500,
    horizontalPosition: 'center',
    verticalPosition: 'bottom'
   })
  }

}
