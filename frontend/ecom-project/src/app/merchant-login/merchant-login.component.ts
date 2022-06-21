import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { MerchantService } from '../merchant-registration.service';

@Component({
  selector: 'app-merchant-login',
  templateUrl: './merchant-login.component.html',
  styleUrls: ['./merchant-login.component.css']
})
export class MerchantLoginComponent implements OnInit {
  merchantLoginForm:any;
  constructor(private fb:FormBuilder, private ms:MerchantService) { 
    this.merchantLoginForm=this.fb.group({
      id:[],
      password:[]
    });
  }

  ngOnInit(): void {
  }

  fnSubmit()
  {
    this.ms.fnLogin(this.merchantLoginForm.value).subscribe((data)=>console.log(data));
  }
}
