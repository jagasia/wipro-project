import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  URL="http://localhost:8082/customer";
  constructor(private http:HttpClient) { }

  fnFindCustomerById(id:any)
  {
    return this.http.get(this.URL+"/"+id);
  }
}
