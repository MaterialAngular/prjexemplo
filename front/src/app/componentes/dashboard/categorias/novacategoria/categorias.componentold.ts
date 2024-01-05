import { Component, OnInit  } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { CategoriaService } from '../../../../services/categoria/ccorreta_ategoria.service';
/*
@Component({
  selector: 'categorias-root',
  templateUrl: './categorias.component.html',
  styleUrls: ['./categorias.component.css']
})

export class CategoriasComponent implements OnInit{

  frmCategoria: FormGroup;
  categorias: any;

  constructor(
    public fb: FormBuilder,
    public categoriaService: CategoriaService
  ){ }

  //Iniciar Categoria
  ngOnInit(): void {
    this.frmCategoria = this.fb.group({
      descricao:     ['', Validators.required]
    });

    this.categoriaService.getAllCategoria().subscribe( resp => {
        this.categorias = resp;
    },
        error => { console.error(error)}
    )
  }

  //Salvar CAtegoria
  OnSalvarCategoria(): void{
    this.categoriaService.SalvarCategoria(this.frmCategoria.value).subscribe(resp=>{
      this.frmCategoria.reset();
    },
    error=>{console.error(error)});
  }
}
*/
