import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { Welcome1Component } from './welcome1/welcome1.component';
import { LoginComponent } from './login/login.component';
import { FormsModule} from '@angular/forms';
import { CounterComponent } from './counter/counter.component';
import { CalculatorComponent } from './calculator/calculator.component';
import { ListTodoComponent } from './list-todo/list-todo.component';
import { ErrorComponent } from './error/error.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { LogoutComponent } from './logout/logout.component';
import { DatepickerComponent } from './datepicker/datepicker.component';
import { HttpClientModule } from '@angular/common/http';
import { DisplySelectComponent } from './disply-select/disply-select.component';
import { UpdateComponent } from './update/update.component';

@NgModule({
  declarations: [
    AppComponent,
    Welcome1Component,
    LoginComponent,
    CounterComponent,
    CalculatorComponent,
    ListTodoComponent,
    ErrorComponent,
    HeaderComponent,
    FooterComponent,
    LogoutComponent,
    DatepickerComponent,
    DisplySelectComponent,
    UpdateComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
