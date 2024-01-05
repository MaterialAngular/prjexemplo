import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { NovaCategoriaService } from '../../../../services/categoria/novacategoria/novacategoria.service';

@Component({
  selector: 'novacategoria-root',
  templateUrl: './novacategoria.component.html',
  styleUrls: ['./novacategoria.component.css']
})
export class NovaCategoriaComponent {

  frmNovaCategoria: FormGroup;
  categorias: any[] = [];

  constructor(private fb: FormBuilder,
              private novaCategoriaService: NovaCategoriaService,
              private router: Router
  ){}


  ngOnInit(): void{
    this.initializeFormNovaCategoria();
  }

  private initializeFormNovaCategoria(): void {
    this.frmNovaCategoria = this.fb.group({
      descricao:  ['', Validators.required],
    });
  }

  private handleError(error: any): void {
   console.error('Ocorreu um Erro:', error);
    // Trate o erro de acordo com as necessidades do seu aplicativo
  }

  OnSalvarUsuario(){
    if(this.frmNovaCategoria.valid){
      const novaCategoria = {
        descricao: this.frmNovaCategoria.value.descricao,
      }

      this.novaCategoriaService.salvarCategoria(novaCategoria).subscribe(
        resp => {
          console.log('Categoria salvo com sucesso!', resp);
          // Talvez você queira recarregar a lista de produtos após salvar
          //this.loadProdutos();
        },
        error => {
          this.handleError(error);
        }
      );
      this.router.navigate(['/dashboard/usuarios']);
    }
    }

}
