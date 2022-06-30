import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LoginService {
  URL="http://localhost:8081";
  constructor(private http:HttpClient) { }

  fnLogin(authRequest:any)
  {
    return this.http.post(this.URL+"/login",authRequest);
  }

  // fnHome()
  // {
  //   var jwt=localStorage.getItem('jwt');
  //   console.log(jwt);
    
  //   // if(jwt==null)
  //   // {
  //   //   console.log("You have not logged in yet");
      
  //   // }
    
  //     const httpOptions = {
  //       headers: new HttpHeaders({
  //           'Content-Type':  'application/json',
  //            Authorization: 'Bearer ' + jwt
  //       })
        
  //   };
  //   // return this.http.get('http://localhost:8081/home',{ httpOptions, responseType: 'text' as const });
  //   return this.http.get('http://localhost:8081/home',httpOptions);  
  //   }
    
  // }

  fnHome()
  {
    var jwt=localStorage.getItem('jwt');
    jwt='Bearer '+jwt;
    console.log(jwt);
    
    
    const httpOptions = {
      headers: new HttpHeaders({
          // 'Content-Type':  'application/json',
           Authorization:  jwt,
      })
  };
    return this.http.get('http://localhost:8081/home',httpOptions);
    
  }

}