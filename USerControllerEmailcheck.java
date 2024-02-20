package com.kodnest.tunehub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kodnest.tunehub.entity.User;
import 	com.kodnest.tunehub.service.UserService;

@Controller

public class UsersController {
	//adduser to db
	@Autowired	
	UserService UserService;
	
//	@PostMapping ("/register")
//public String addUser(@RequestParam("username") String username ,
//		@RequestParam("email") String email,
//		@RequestParam("password") String password,
//		@RequestParam("gender") String gender,
//		@RequestParam("role") String role,
//		@RequestParam("address") String address
//		){
//		
//		System.out.println(username+" "+email+" "+password+" "+gender+" "+role+" "+address);
//		return "home";
//	
//	}
	@PostMapping("/register")
	public String addUser(@ModelAttribute User user) {
		//email taken from registration form 
		String email = user.getEmail();
		//checking if email as entered in registration form is present in db or not
		boolean status=UserService.emailExists(email);
		
		// checking email is exists are not
		if(status==false) {
		//System.out.println(user.getUsername()+""+user.getEmail()+""+user.getPassword()+""+user.getGender()+""+user.getRole()+""+user.getAddress());
		UserService.addUser(user);
		System.out.println("User Added");
		}else {
			System.out.println("User Already Exists");
		}
		return"home";
		
	}
	//checking password and email matches to login to home page
	@PostMapping("/validate")
	public String validateUser(@RequestParam("email") String email,@RequestParam("password") String password){
		if(UserService.validateUser(email,password)==true){
		return "home";
		
	}else {
		return"login";
	}
}
	}

