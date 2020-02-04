import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { error } from '@angular/compiler/src/util';
@Injectable({
  providedIn: 'root'
})



export class WelcomeDataService {
  message=''
  constructor(private service:HttpClient) { }

  getMessageFromSpring(){
    console.log("SERVICE CONSOLE");
    return this.service.get<helloBean>('http://localhost:8080/hello-world-bean')
  }
}

export class helloBean{
  constructor(public message:String){
  }
}
