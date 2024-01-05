import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { CategoriaService } from '../../../../services/categoria/ccorreta_ategoria.service';
import { ProdutoService } from   '../../../../services/produto/produto.servicehttp';


@Component({
  selector: 'app-produtos',
  templateUrl: './produtos.component.html',
  styleUrls: ['./produtos.component.css']
})

export class ProdutosComponent implements OnInit{
/*
  frmProduto: FormGroup;
  categoria: any;

  constructor(
    public fb: FormBuilder,
    public categoriaService: CategoriaService,
    public produtoService: ProdutoService
  ){ }

  ngOnInit(): void {
    this.frmProduto = this.fb.group({
      id_categoria:  ['', Validators.required],
      descricao:  ['', Validators.required]
    });

    this.categoriaService.getAllCategoria().subscribe( resp => {
        this.categoria = resp;
        alert(this.categoria);
    },
        error => {console.error(error)}
    );
    */
/*
    this.frmProduto.get('categoria').valueChanges.subscribe(value=>{

        this.produtos.getAllProdutoByCategoria(value.id).subscribe( resp => {
            this.produtoService = resp;
        },
          error => {console.error(error)})
    });

  } */

  /*   this.categoriaService.getAllCategoria().pipe(
      map(desc => this.categorias.map(desc => desc.descricao))
  ).subscribe(categ => console.log(categ));
*/


   /* this.categoriaService.getAllCategoria().subscribe({
        next: (data: any) => { this.categorias = data['descricao'];
      },
        error: (error: any) =>{},
      });
  }*/

 /* OnSalvar(): void{

    this.produtoService.SalvarProduto(this.frmProduto.value).subscribe(resp=>{
      this.frmProduto.reset();
    },
    error=>{console.error(error)});
  } */



  frmProduto: FormGroup;
  categorias: any[] = [];

  constructor(
    public fb: FormBuilder,
    public categoriaService: CategoriaService,
    public produtoService: ProdutoService
  ) {}

  ngOnInit(): void {
    //this.initializeFormProduto();
    //this.loadCategorias();


    //private initializeFormProduto(): void {
      this.frmProduto = this.fb.group({
        idCategoria: ['', Validators.required],
        descricao: ['', Validators.required]
      });


      //private loadCategorias(): void {
      this.categoriaService.getAllCategoria().subscribe( resp => {
          this.categorias = resp;
        console.log('Categorias:', this.categorias);
        },
          error => { this.handleError(error)}
      );

    /*  this.frmProduto.get('modeloCategoria').valueChanges.subscribe(value=>{

        this.produtoService.getAllProdutoByCategoria(value.id).subscribe( resp => {
          this.produtoService = resp;
        },
          error => {console.error(error)}
        );
      }); */
    }

    private handleError(error: any): void {
      console.error('Ocorreu um erro:', error);
      // Trate o erro de acordo com as necessidades do seu aplicativo
    }

    OnSalvar(): void{

      this.produtoService.saveProduto(this.frmProduto.value).subscribe(resp=>{
        this.frmProduto.reset();
      },
      error=>{console.error(error)}
      );
    }


/*
  OnSalvar(): void {
    if (this.frmProduto.valid) {
      const novoProduto = {
        idCategoria: this.frmProduto.get('id_categoria').value,
        descricao: this.frmProduto.get('descricao').value,
      };


      this.produtoService.saveProduto(novoProduto).subscribe(
        resp => {
          console.log('Produto salvo com sucesso!', resp);
          // Talvez você queira recarregar a lista de produtos após salvar
          //this.loadProdutos();
        },
        error => {
          this.handleError(error);
        }
      );
    }
  } */
}
