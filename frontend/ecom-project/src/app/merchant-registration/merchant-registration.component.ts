import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { MerchantRegistrationService } from '../merchant-registration.service';

@Component({
  selector: 'app-merchant-registration',
  templateUrl: './merchant-registration.component.html',
  styleUrls: ['./merchant-registration.component.css']
})
export class MerchantRegistrationComponent implements OnInit {
  merchantRegistrationForm:any;

  constructor(private fb:FormBuilder, private mrs:MerchantRegistrationService) {
    this.merchantRegistrationForm=this.fb.group({
      contact: [],
      email: [],
      gstin: [],
      name: []
    });
   }

  ngOnInit(): void {
  }

  fnSubmit()
  {
    this.mrs.fnCreate(this.merchantRegistrationForm.value).subscribe((data)=>console.log(data));    
  }
}
