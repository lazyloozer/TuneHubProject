package com.kodnest.tunehub.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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
		System.out.println(user.getUsername()+""+user.getEmail()+""+user.getPassword()+""+user.getGender()+""+user.getRole()+""+user.getAddress());
		UserService.addUser(user);
		return"home";
		
	}

}