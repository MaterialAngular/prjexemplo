import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { CategoriaService } from '../../../services/categoria/ccorreta_ategoria.service';
import { ClienteService } from '../../../services/cliente/cliente.servicehttp';
import { ProdutoService } from '../../../services/produto/produto.servicehttp';
import { PedidoService } from '../../../services/pedido/pedido.service';
//import { UsuarioService } from '../../../services/usuario/usuario.service';


@Component({
  selector: 'pedidos-root',
  templateUrl: './pedidos.component.html',
  styleUrls: ['./pedidos.component.css']
})

export class PedidosComponent implements OnInit{


  frmPedido: FormGroup;
  //usuarios:   any[] = [];
  clientes:   any[] = [];
  categorias: any[] = [];
  produtos:   any[] = [];
  idClienteInput: any;

  constructor(
    public fb: FormBuilder,
    public categoriaService: CategoriaService,
    public clienteService: ClienteService,
    public produtoService: ProdutoService,
    public pedidoService: PedidoService
    //public usuarioService: UsuarioService
  ){ }

  ngOnInit(): void {

     //Formatar a data como uma string no formato 'yyyy-MM-dd' (ou o formato desejado)



    this.frmPedido = this.fb.group({
      //idUsuario:    ['', Validators.required],
      idCategoria:  ['', Validators.required],
      idCliente:    ['', Validators.required],
      idProduto:    ['', Validators.required],
      //dataPedido:   ['', Validators.required],
      quantidade:   ['', Validators.required],
    });

    //this.frmPedido.get('dataPedido').setValue(dataFormatada);

    /**** Carregando todas as categorias ****/
    this.categoriaService.getAllCategoria().subscribe( resp => {
        this.categorias = resp;
        //console.log('Categorias:', this.categorias);
      },
        error => { console.error(error)}
    );
    /**** Fim do Carregar Categorias ****/

    /**** Selecionando o Produto de acordo com a Categoria ****/
    this.frmPedido.get('idCategoria').valueChanges.subscribe(value => {

      this.pedidoService.getAllProdutoByCategoria(value.id).subscribe( resp => {
        this.produtos = resp;
      },
        error => {console.error(error)}
      );
    });
    /**** Fim do Selecionar Produto */
  }

  private handleError(error: any): void {
    console.error('Ocorreu um erro:', error);
    // Trate o erro de acordo com as necessidades do seu aplicativo
  }

  /**** Função para carregar a data no formato YYYY/MM/DD ****/
 /* formatarData(data: Date): string {
    const ano = data.getFullYear();
    const mes = String(data.getMonth() + 1).padStart(2, '0'); // Adicionar 1 ao mês, pois janeiro é 0
    const dia = String(data.getDate()).padStart(2, '0');
    return '${ano}-${mes}-${dia}';
  } */
  /**** Fim da Função ****/

  OnSalvar(): void{

    /**** Iniciando Conversão do campo idCliente ****/
    const idClienteString = this.frmPedido.get('idCliente').value;

    /**** Convertendo o campo idCliente para um objeto ****/
    const idClienteObjeto = { id: parseInt(idClienteString, 10) };

    // Define o valor de idCliente no formulário como o objeto criado
    this.frmPedido.get('idCliente').setValue(idClienteObjeto);
    /**** Fim da Conversão ****/

    console.log("Conteudo a ser gravado", this.frmPedido.value);

    this.pedidoService.savePedido(this.frmPedido.value).subscribe(resp=>{
      this.frmPedido.updateValueAndValidity();
        this.frmPedido = this.fb.group({
          idCategoria: ['', Validators.required],
          idCliente:   ['', Validators.required],
          idProduto:   ['', Validators.required],
          quantidade:  ['', Validators.required],
        });
      },
      error=>{console.error(error)}
    );

  }
}



    //const objetoIdCliente = { id: this.frmPedido.idCliente };
    //console.log("Conteúdo de frmGroup ", this.frmPedido.value);



  /*  this.clienteService.getById().subscribe( resp => {
      this.clientes = resp;
      this.frmPedido.get('nomeCliente').setValue(resp.nomeCliente);
        //console.log('Categorias:', this.categorias);
    },
      error => { console.error(error)}
  );  */


