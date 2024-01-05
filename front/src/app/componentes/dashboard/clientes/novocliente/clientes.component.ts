import { Component, OnInit  } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ClienteService } from '../../../services/cliente/cliente.service';

@Component({
  selector: 'clientes-root',
  templateUrl: './clientes.component.html',
  styleUrls: ['./clientes.component.css']
})

export class ClientesComponent implements OnInit{

  frmCliente: FormGroup;
  clientes: any;

  constructor(
    public fb: FormBuilder,
    public clienteService: ClienteService
  ){ }

  //Iniciar Categoria
  ngOnInit(): void {
    this.frmCliente = this.fb.group({
      cpf:      ['', Validators.required],
      nome:     ['', Validators.required],
      endereco: ['', Validators.required]
    });

    this.clienteService.getAllCliente().subscribe( resp => { 
        this.clientes = resp; 
    }, 
        error => { console.error(error)} 
    )  
  }
  
  //Salvar CAtegoria
  OnSalvarCliente(): void{
    this.clienteService.SalvarCliente(this.frmCliente.value).subscribe(resp=>{
      this.frmCliente.reset();
    },
    error=>{console.error(error)});  
  }
}
