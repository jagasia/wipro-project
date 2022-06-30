import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CartService {
  URL="http://localhost:8082/cart";
  constructor(private http:HttpClient) { }

  fnAddToCart(cart:any)
  {
    console.log(cart);
    return this.http.post(this.URL,cart);
  }

  fnFindCartByCid(cid:any)
  {
    return this.http.get(this.URL+"/customer/"+cid);
  }
}
