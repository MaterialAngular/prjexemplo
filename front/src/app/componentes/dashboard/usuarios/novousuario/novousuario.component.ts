import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { NovoUsuarioService } from '../../../../services/usuario/novousuario/novousuario.service';

@Component({
  selector: 'novousuario-root',
  templateUrl: './novousuario.component.html',
  styleUrls: ['./novousuario.component.css']
})
export class NovousuarioComponent {

  frmNovoUsuario: FormGroup;
  usuarios: any[] = [];

  constructor(private fb: FormBuilder,
              private novousarioService: NovoUsuarioService,
              private router: Router
  ){}
                

  ngOnInit(): void{
    this.initializeFormNovoUsuario();
  }

  private initializeFormNovoUsuario(): void {
    this.frmNovoUsuario = this.fb.group({
      nomeusuario:  ['', Validators.required],
      loginusuario: ['', Validators.required],
      senhausuario: ['', Validators.required]
    });
  }

  private handleError(error: any): void {
   console.error('Ocorreu um Erro:', error);
    // Trate o erro de acordo com as necessidades do seu aplicativo
  }  

  OnSalvarUsuario(){
    if(this.frmNovoUsuario.valid){
      const novousuario = {
        nomeusuario: this.frmNovoUsuario.value.nomeusuario,
        loginusuario: this.frmNovoUsuario.value.loginusuario,
        senhausuario: this.frmNovoUsuario.value.senhausuario,
      }
      
      this.novousarioService.salvarUsuario(novousuario).subscribe(
        resp => {
          console.log('Usuário salvo com sucesso!', resp);
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
