import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DashboardComponent } from './dashboard.component';
import { PrincipalComponent } from './principal/principal.component';
import { ProdutosComponent } from './produtos/produtos.component';
import { UsuariosComponent } from './usuarios/usuarios.component';
import { CategoriasComponent } from './categorias/categorias.component';
import { ClientesComponent } from './clientes/clientes.component';
import { PedidosComponent } from './pedidos/pedidos.component';
import { RelatoriosComponent } from './relatorios/relatorios.component';
import { NovousuarioComponent } from './usuarios/novousuario/novousuario.component';

const routes: Routes = [
  { path: '', component: DashboardComponent, children: [
    { path: '', component: PrincipalComponent },
    { path: 'usuarios', component: UsuariosComponent },
    { path: 'categorias', component: CategoriasComponent },
    { path: 'clientes', component: ClientesComponent },
    { path: 'produtos', component: ProdutosComponent },
    { path: 'pedidos', component: PedidosComponent },
    { path: 'relatorios', component: RelatoriosComponent },
    { path: 'novousuario', component:  NovousuarioComponent }
  ]}
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class DashboardRoutingModule { }
