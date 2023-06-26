import { Component, OnInit } from '@angular/core';
import { UserAuthService } from '../_services/user-auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.scss']
})
export class HeaderComponent implements OnInit {

  constructor(private userAuthservice:UserAuthService ,private router:Router) { }

  ngOnInit(): void {
  }
public isLogggedIn(){
return this.userAuthservice.isLoggedIn();
}

public logout(){
  this.userAuthservice.clear();
  this.router.navigate(['/home']);
}
}
