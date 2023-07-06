import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class UserAuthService {
  constructor() {}

  public setRoles(roles: any[]) {
    localStorage.setItem('roles', JSON.stringify(roles));
  }

  public getRoles(): any[] {
    const rolesString = localStorage.getItem('roles');
    return rolesString ? JSON.parse(rolesString) : [];
  }

  public setToken(jwtToken: string) {
    localStorage.setItem('jwtToken', jwtToken);
  }

  public getToken(): string {
    const jwtToken = localStorage.getItem('jwtToken');
    return jwtToken || '';
  }
  public clear() {
    localStorage.clear();
  }

  public isLoggedIn() {
    return this.getRoles() && this.getToken();
  }

  public isAdmin(){
   const roles: any[] = this.getRoles();
  return  roles[0].roleName==='Admin';

   
   
  }
  public isUser(){
   const roles: any[] = this.getRoles();
   return roles[0].roleName==='User';
   
  }
}
