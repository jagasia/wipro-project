import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.css']
})
export class AddProductComponent implements OnInit {
  addProductForm:any;
  selectedFile:any;
  constructor(private fb:FormBuilder, private ps:ProductService) { 
    this.addProductForm=this.fb.group({
      // id
      name:[''],
      price:[''],
      picture:[]
    });
  }

  ngOnInit(): void {
  }

  fnChange(event:any)
  {
    this.selectedFile=event.target.files[0];
    console.log(JSON.stringify(this.selectedFile));
  }

  fnAdd()
  {
    alert('hi')
    var product=new FormData();
    // alert(this.addProductForm.controls.name.value);
    product.append('name',this.addProductForm.controls.name.value)
    product.append('price',this.addProductForm.controls.price.value)
    product.append('picture',this.selectedFile, this.selectedFile.name);

    console.log(product);
    
    this.ps.fnAddProduct(product).subscribe((data)=>{
      console.log(data);
    },(error)=>{
      console.log(error);
      
    });
  }
}
