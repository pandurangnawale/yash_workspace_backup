import { Component, OnInit } from '@angular/core';
import { Router} from '@angular/router';
@Component({
  selector: 'app-routing-test',
  templateUrl: './routing-test.component.html',
  styleUrls: ['./routing-test.component.css']
})
export class RoutingTestComponent implements OnInit {

  constructor(private route:Router) { }

  ngOnInit() {

  }

  

}
