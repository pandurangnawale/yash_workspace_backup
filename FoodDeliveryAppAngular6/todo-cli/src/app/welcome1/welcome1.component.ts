import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { WelcomeDataService } from '../service/welcome-data.service';
import { error } from '@angular/compiler/src/util';

@Component({
  selector: 'app-welcome1',
  templateUrl: './welcome1.component.html',
  styleUrls: ['./welcome1.component.css']
})
export class Welcome1Component implements OnInit {
  username='';
  messageFromSpring='';
  constructor(private router:ActivatedRoute, private service:WelcomeDataService) { }

  ngOnInit() {
    this.username=this.router.snapshot.params['username'];
  }

  getWelcomeData(resoponse){   
      this.service.getMessageFromSpring().subscribe(
      resoponse=>this.handlSucessData(resoponse),
      resoponse=>this.handleError(error)  //if error show on web page
      )    
  }

  handlSucessData(resoponse){
    this.messageFromSpring=resoponse.message;
  }

  handleError(error){
    this.messageFromSpring=error.message;
  }
}
