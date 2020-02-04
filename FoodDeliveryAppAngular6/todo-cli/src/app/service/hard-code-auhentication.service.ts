import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class HardCodeAuhenticationService {

  constructor() { }

  LoginAuhentication(userName,password){
      if(userName=== 'pandu' && password==='pandu'){
        sessionStorage.setItem('authenticateUser',userName)
         return true; 
      }else{
          return false;
      }
  }

  isLogin(){
    let user = sessionStorage.getItem('authenticateUser')
    return !(user===null)
  }

  sessionLogout(){
    let user=sessionStorage.removeItem('authenticateUser')
  }

}
