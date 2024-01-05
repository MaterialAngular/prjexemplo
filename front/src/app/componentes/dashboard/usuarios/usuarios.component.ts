import { Component, OnInit, ViewChild } from '@angular/core';
import { MatPaginator } from '@angular/material/paginator';
import { MatSnackBar } from '@angular/material/snack-bar';
import { MatSort } from '@angular/material/sort';
import { MatTableDataSource } from '@angular/material/table';
import { Usuarios } from 'src/app/interfaces/usuarios';
import { UsuarioService } from 'src/app/services/usuario/usuario.service';
import { Observable, catchError, of } from 'rxjs';

@Component({
  selector: 'app-usuarios',
  templateUrl: './usuarios.component.html',
  styleUrls: ['./usuarios.component.css']
})

export class UsuariosComponent implements OnInit{
  listUsuarios$: Observable<Usuarios[]>;

  displayedColumns: string[] = ['codigo', 'nome', 'login', 'senha', 'acoes'];
  dataSource : MatTableDataSource<Usuarios>;

  @ViewChild(MatPaginator) paginator : MatPaginator;
  @ViewChild(MatSort) sort : MatSort;

  constructor (private usuarioService: UsuarioService, private snackBar: MatSnackBar){}

  ngOnInit(): void{
    this.listUsuarios$ = this.usuarioService.getAllUsuarios()
    .pipe(
      catchError(error => {
        console.error('Erro ao buscar usuários', error);
        return of([]);
      })
    );

    this.listUsuarios$.subscribe(data => {
      this.dataSource = new MatTableDataSource(data);
      this.dataSource.paginator = this.paginator;
      this.dataSource.sort = this.sort;
    });

  }

 // carregarUsuarios(){
    //this.listUsuarios = this._usuarioService.getAllUsuarios();
   // this.dataSource = new MatTableDataSource(this.listUsuarios);
 // }

  applyFilter(event: Event) {
    const filterValue = (event.target as HTMLInputElement).value;
    this.dataSource.filter = filterValue.trim().toLowerCase();
  }

  ngAfterViewInit() {
    this.dataSource.paginator = this.paginator;
    this.dataSource.sort = this.sort;
  }

  apagarUsuario(index: number){
   // console.log(index);
   //this.usuarioService.apagarUsuario(index);
  // this.carregarUsuarios();

   this.snackBar.open('Usuário excluído com sucesso!', 'Ok',{
    duration: 1500,
    horizontalPosition: 'center',
    verticalPosition: 'bottom'
   })
  }

}


