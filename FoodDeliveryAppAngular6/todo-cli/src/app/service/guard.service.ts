import { Injectable } from '@angular/core';
import { CanActivate, ActivatedRouteSnapshot, RouterStateSnapshot } from '@angular/router';
import { HardCodeAuhenticationService } from './hard-code-auhentication.service';

@Injectable({
  providedIn: 'root'
})

export class GuardService implements CanActivate{
  canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot){
    //return this.auth.isLogin();
    if(this.auth.isLogin()){
        return true;
    }
    return false;
  }

  constructor(private auth : HardCodeAuhenticationService) { }
}
