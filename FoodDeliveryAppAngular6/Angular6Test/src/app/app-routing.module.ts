import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { RoutingTestComponent } from './routing-test/routing-test.component';
const routes: Routes = [
  {path : 'routingTest',component:RoutingTestComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
