import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  URL="http://localhost:8081/product";

  constructor(private http:HttpClient) { }

  fnGetAllProducts()
  {
    return this.http.get(this.URL);
  }

  fnAddProduct(product:any)
  {
    return this.http.post(this.URL+"/add",product);
  }
}
