import { Observable } from 'rxjs';
import { SingleResponseModel } from './../models/singleResponseModel';
import { TokenModel } from './../models/tokenModel';
import { HttpClient } from '@angular/common/http';
import { LoginModel } from './../models/loginModel';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class AuthService {
  apiUrl = 'https://localhost:44308/api/auth/';
  constructor(private httpClient: HttpClient) {}

  login(loginUser: LoginModel) {
    return this.httpClient.post<SingleResponseModel<TokenModel>>(
      this.apiUrl + 'login',
      loginUser
    );
  }

  isAuthenticated() {
    if (localStorage.getItem('token')) {
      return true;
    } else {
      return false;
    }
  }
}
