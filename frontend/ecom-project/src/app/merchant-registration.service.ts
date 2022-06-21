import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class MerchantService {
  URL='http://localhost:8081/merchant';

  constructor(private http:HttpClient) { }

  fnCreate(merchant:any)
  {
    return this.http.post(this.URL,merchant);
  }

  fnLogin(authRequest:any)
  {
    return this.http.post(this.URL+"/login",authRequest);
  }
}
