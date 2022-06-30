package com.wipro.ecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.ecom.entities.AuthRequest;
import com.wipro.ecom.entities.MyToken;
import com.wipro.ecom.entities.MyUser;
import com.wipro.ecom.entities.Response;
import com.wipro.ecom.service.MyUserDetailsService;
import com.wipro.ecom.util.JwtUtil;

@RestController
//@CrossOrigin(origins = {"http://localhost:4200","*"})
@CrossOrigin(origins = {"http://localhost:4200","*"})
public class MyUserController {
	@Autowired
	private MyUserDetailsService us;
	
	@Autowired
	private JwtUtil jwtUtil;
	
    @Autowired
    private AuthenticationManager authenticationManager;

	@PostMapping("/signup")
	public MyUser signup(@RequestBody MyUser user)
	{
		return us.registerMyUser(user);
	}
	
    @PostMapping("/login")
    public MyToken generateToken(@RequestBody AuthRequest authRequest) throws Exception {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authRequest.getUserName(), authRequest.getPassword())
            );
        } catch (Exception ex) {
            throw new Exception("inavalid username/password");
        }
        MyToken token=new MyToken();
        token.setJwt(jwtUtil.generateToken(authRequest.getUserName()));
        return token;
    }


    @GetMapping("/home")
    public Response welcome() {
    	return new Response("Welcome to home");
    }
}
