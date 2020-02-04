import { NgModule, Component } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {LoginComponent} from './login/login.component';
import { Welcome1Component } from './welcome1/welcome1.component';
import { ListTodoComponent } from './list-todo/list-todo.component';
import { ErrorComponent } from './error/error.component';
import { LogoutComponent } from './logout/logout.component';
import { CalculatorComponent } from './calculator/calculator.component';
import { CounterComponent } from './counter/counter.component';
import { HardCodeAuhenticationService } from './service/hard-code-auhentication.service';
import { GuardService } from './service/guard.service';
import { DisplySelectComponent } from './disply-select/disply-select.component';

const routes: Routes = [
  {path :'', component:LoginComponent},
  {path : 'login', component:LoginComponent},
  {path : 'welcome1/:username', component:Welcome1Component,canActivate:[GuardService]},
  {path : 'todolist', component:ListTodoComponent,canActivate:[GuardService]},
  {path : 'Home', component:Welcome1Component,canActivate:[GuardService]},
  {path : 'Logout',component:LogoutComponent,canActivate:[GuardService]},
  {path : 'calculator',component:CalculatorComponent,canActivate:[GuardService]},
  {path : 'counter',component:CounterComponent,canActivate:[GuardService]},
  {path : 'select',component:DisplySelectComponent,canActivate:[GuardService]},
  {path : '**', component:ErrorComponent}
]
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
