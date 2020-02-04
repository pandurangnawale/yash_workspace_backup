import { Component, OnInit } from '@angular/core';
import { CompileShallowModuleMetadata } from '@angular/compiler';
import { Router } from '@angular/router';
import { HardCodeAuhenticationService } from '../service/hard-code-auhentication.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  username=''
  password=''
  errorMessage=''
  constructor(private route:Router,private authService : HardCodeAuhenticationService) { }

  ngOnInit() {
  }

  login(){
    //console.log(this.username)
    console.log('User Name  ' +this.username + ' Password  '+ this.password)
    //if(this.username=='pandu' && this.password=='pandu'){
      if(this.authService.LoginAuhentication(this.username,this.password)){
        sessionStorage.setItem('authenticateUser',this.username)
        this.route.navigate(['welcome1',this.username]) //url
      //this.errorMessage=true      
    }else{
      //this.errorMessage=false
        this.errorMessage='Password neet taka';
    }
  }

  

}
