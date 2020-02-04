import { Component, OnInit } from '@angular/core';
import { HardCodeAuhenticationService } from '../service/hard-code-auhentication.service';

@Component({
  selector: 'app-logout',
  templateUrl: './logout.component.html',
  styleUrls: ['./logout.component.css']
})
export class LogoutComponent implements OnInit {

  constructor(private authService:HardCodeAuhenticationService) { }

  ngOnInit() {
    this.authService.sessionLogout();
  }

}
