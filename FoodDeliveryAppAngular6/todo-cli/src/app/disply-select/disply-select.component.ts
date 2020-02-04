import { Component, OnInit } from '@angular/core';
import { GetDataService, todoPojo } from '../service/get-data.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-disply-select',
  templateUrl: './disply-select.component.html',
  styleUrls: ['./disply-select.component.css'],
  styles:[`
    .backdrop{
      background-color:rgba(0,0,0,0.6);
      position: fixed;
      top:0;
      left: 0;
      width: 100%;
      height:100vh;
}`]
})
export class DisplySelectComponent implements OnInit {

  id:number;
  username='';
  description='';
  targetDate:Date
  status:boolean
  private pojoArray: todoPojo[] = null;
  deleteMessage='';
  display='none';
  
  constructor(private router:ActivatedRoute, private selectService:GetDataService) { }

  ngOnInit() {
    this.getSelectData();
  }



  getSelectData(){
    this.selectService.getData().subscribe(
      ((data:todoPojo[])=>this.getDataSuccess(data))
    )
  }

  getDataSuccess(data){
    this.pojoArray=data;   
  }

  deleteResourse(id){
    this.selectService.deleteData(id).add(data=>this.getSelectData());
    console.log("ID value is "+id);    
    this.deleteMessage='Deleted Successfully '+id;
  }

  updateResourse(id,username,description,targetDate,status){
    this.display="block";
    console.log(id +" === "+ username +" === "+description+" === "+targetDate+" === "+status);
    
    
    //this.selectService.deleteConfirm(id,username,description,targetDate,status);
  }
}
