import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { DashboardRoutingModule } from './dashboard-routing.module';

import { DashboardComponent } from './dashboard.component';
import { CompartilhadosModule } from '../compartilhados/compartilhados.module';
import { PrincipalComponent } from './principal/principal.component';
import { NavbarComponent } from './navbar/navbar.component';
import { UsuariosComponent } from './usuarios/usuarios.component';
import { ProdutosComponent } from './produtos/produtos.component';
import { CategoriasComponent } from './categorias/categorias.component';
import { ClientesComponent } from './clientes/clientes.component';
import { PedidosComponent } from './pedidos/pedidos.component';
import { RelatoriosComponent } from './relatorios/relatorios.component';
import { NovousuarioComponent } from './usuarios/novousuario/novousuario.component';


@NgModule({
  declarations: [
    DashboardComponent,
    PrincipalComponent,
    NavbarComponent,
    UsuariosComponent,
    ProdutosComponent,
    CategoriasComponent,
    ClientesComponent,
    PedidosComponent,
    RelatoriosComponent,
    NovousuarioComponent
  ],
  imports: [
    CommonModule,
    DashboardRoutingModule,
    CompartilhadosModule
  ]
})
export class DashboardModule { }
