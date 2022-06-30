import { Component, OnInit } from '@angular/core';
import { CartService } from '../cart.service';
import { CustomerService } from '../customer.service';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-display-product',
  templateUrl: './display-product.component.html',
  styleUrls: ['./display-product.component.css']
})
export class DisplayProductComponent implements OnInit {
  products:any;
  constructor(private ps:ProductService, private cs:CustomerService, private cartS:CartService) { }

  ngOnInit(): void {
    this.ps.fnGetAllProducts().subscribe((data)=>{
      console.log(data);
      this.products=data;
      console.log(this.products);
    },(error)=>{
      console.log(error);
    });
  }

  fnAddToCart(id:any)
  {
    alert(id);
    var product:any;
    var customer:any;
    this.ps.fnFindProductById(id).subscribe((data)=>{
      product=data;

      //take the logged in customer id from localStorage
      var cid=1;
      // cid=localStorage.getItem("cid");
      
      this.cs.fnFindCustomerById(cid).subscribe((data)=>{
        customer=data;

        var qty=1;

        var cart={"customer":customer,"product":product,"quantity":qty};
        this.cartS.fnAddToCart(cart).subscribe((data)=>{
          console.log("After adding, we got the following response from add to cart");
          console.log(data);
        });
      });
      
    })
  }
}
