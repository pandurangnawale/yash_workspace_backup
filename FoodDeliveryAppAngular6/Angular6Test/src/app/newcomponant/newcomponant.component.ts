import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-newcomponant',
  templateUrl: './newcomponant.component.html',
  styleUrls: ['./newcomponant.component.css']
})
export class NewcomponantComponent implements OnInit {

  constructor() { }

  titleData ="Angular 6";
  varData = "Welcome to Angular 6 tutorial...!"

  ngOnInit() {
  }

}
