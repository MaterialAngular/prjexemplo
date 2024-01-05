import { Injectable } from '@angular/core';
import { SharedService } from './shared.service';
import { Observable } from 'rxjs';
import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})

export class AuthGuardService {

  constructor( private shared: SharedService, private router:Router) { }

  funcCanActivate():Observable <boolean> | boolean{
    let logado: boolean = this.shared.isAuthenticated(); 
    
    if (!logado){
      //caso não esteja logado!
      this.router.navigate(['login']);
    }   
    return logado;
  }
}
