import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-display-product',
  templateUrl: './display-product.component.html',
  styleUrls: ['./display-product.component.css']
})
export class DisplayProductComponent implements OnInit {
  products:any;
  constructor(private ps:ProductService) { }

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
    alert(id)
  }
}
