import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-counter',
  templateUrl: './counter.component.html',
  styleUrls: ['./counter.component.css']
})
export class CounterComponent implements OnInit {

  counterPlus:boolean;
  counterMinus:boolean;
  count=0;
  constructor() { }

  ngOnInit() {
  }

  CounterEventPlus(){
    this.count++;
    
  }
  CounterEventMinus(){
    this.count--;
    
  }

  CounterReset(){
    this.count=0;
  }

}
