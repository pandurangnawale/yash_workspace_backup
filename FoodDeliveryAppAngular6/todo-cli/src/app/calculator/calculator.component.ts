import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-calculator',
  templateUrl: './calculator.component.html',
  styleUrls: ['./calculator.component.css']
})
export class CalculatorComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

  sum: number;
  add(first:number, second:number) {
   this.sum = +first + +second;
  }
  sub(first:number, second:number) {
    this.sum = +first - +second;
   }
   mul(first:number, second:number) {
    this.sum = +first * +second;
   }
   dv(first:number, second:number) {
    this.sum = +first / +second;
   }

}
