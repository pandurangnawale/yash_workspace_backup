import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule} from '@angular/router';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NewcomponantComponent } from './newcomponant/newcomponant.component';
import { NgmodelTestComponent } from './ngmodel-test/ngmodel-test.component';
import { ChangeTextDirective } from './change-text.directive';
import { RoutingTestComponent } from './routing-test/routing-test.component';

@NgModule({
  declarations: [
    AppComponent,
    NewcomponantComponent,
    NgmodelTestComponent,
    ChangeTextDirective,
    RoutingTestComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
