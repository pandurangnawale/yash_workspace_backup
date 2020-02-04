import { Component, OnInit } from '@angular/core';
import { Router} from '@angular/router';

@Component({
  selector: 'app-ngmodel-test',
  templateUrl: './ngmodel-test.component.html',
  styleUrls: ['./ngmodel-test.component.css']
})
export class NgmodelTestComponent implements OnInit {

  ifVar=true;
  pipesVar="welcome to angualr 6 Pipes...!";
  todayDate = new Date();
  jsonVal = {name:'Rox', age:'25', address:{a1:'Mumbai', a2:'Karnataka'}}

  constructor(private route:Router) { }

  ngOnInit() {
  }

  public data1:String;
  months =['Jan','Feb','Mar','Apr','May','Jun','Jul','Aug','Sep','Oct','Nov','Dev'];

  clickEventTest(evnt){
    this.data1="Yeda Pintya....!" + evnt;
    alert("Yeda Pintya....!" +evnt);
    this.ifVar=false;
  }


  changeEventFunction(eventResponse){
    alert(eventResponse);
    console.log("Change Event  "+eventResponse);
    this.ifVar=false;
    
  }


  routerTest(){
    this.route.navigate(['/routingTest']);
    //this.router.navigate(['/dashbord',this.username]);
  }

}
