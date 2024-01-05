import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { MatSnackBar } from '@angular/material/snack-bar';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit{
  frmLogin: FormGroup;
  loading = false;

  constructor(
    private fb: FormBuilder,
    private _snackBar: MatSnackBar,
    private router: Router)
    {

    this.frmLogin = this.fb.group({
      usuario: ['', Validators.required],
      senha: ['', Validators.required]
    })
  }

  ngOnInit(): void{

  }

  acessarSistema(): void{
    const usuario = this.frmLogin.value.usuario;
    const senha = this.frmLogin.value.senha;

    // console.log(usuario);
    // console.log(senha);

    if(usuario == 'admin' && senha == 'admin'){
      this.validarLogin();
    }else{
      this.error();
      this.frmLogin.reset();
    }
  }

  error(){
    this._snackBar.open('Usuário ou Senha Inválida!','Ok', {
      duration: 1000,
      horizontalPosition: 'center',
      verticalPosition: 'bottom',
    })
  }

  validarLogin(){
    this.loading = true;
    setTimeout(()=> {
      this.router.navigate(['dashboard'])
    }, 1500)
  }

}
