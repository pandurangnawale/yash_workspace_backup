import { Component, OnInit } from '@angular/core';
import { HardCodeAuhenticationService } from '../service/hard-code-auhentication.service';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  constructor(private ServiceAuth:HardCodeAuhenticationService) { }

  ngOnInit() {
  }

}
