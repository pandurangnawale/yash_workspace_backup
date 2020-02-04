import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class GetDataService {
  constructor(private selectHttp:HttpClient) { }

  getData(){
    let users:String ='users';
      return this.selectHttp.get<todoPojo[]>(`http://localhost:8080/${users}`);
  }

  deleteData(id){
    //console.log(" Its time to delete the data ")
    return this.selectHttp.delete('http://localhost:8080/users/todos/'+id).subscribe();
}

  deleteConfirm(id,username,description,targetDate,status){
    return this.selectHttp.delete('').subscribe();
  }
}
export class todoPojo{
  constructor(
    public id:Number,
    public username:String,
    public description:String,
    public targetDate:Date,
    public done:boolean
    ){
}}
