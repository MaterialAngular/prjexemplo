import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

//Componentes
import { LoginComponent } from './componentes/login/login.component';
import { CompartilhadosModule } from './componentes/compartilhados/compartilhados.module';


@NgModule({
  declarations: [
    AppComponent,
    LoginComponent

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    CompartilhadosModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
