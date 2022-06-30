import { Component, OnInit } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { LoginService } from '../login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  loginForm:any;
  constructor(private fb:FormBuilder, private ls:LoginService) { 
    this.loginForm=this.fb.group({
      userName:[],
      password:[]
    });
  }

  ngOnInit(): void {
  }

  fnLogin()
  {
    this.ls.fnLogin(this.loginForm.value).subscribe((data)=>{
      console.log(data);
      //store this token in localStorage
      var token={jwt:''};
      token=<any>data;
      console.log(token.jwt);
      localStorage.setItem('jwt',token.jwt);
      
    },(error)=>{
      console.log(error);
      
    });
  }
}
