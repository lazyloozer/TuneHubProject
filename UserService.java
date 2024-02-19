package com.kodnest.tunehub.service;

import org.springframework.web.bind.annotation.RequestBody;

import com.kodnest.tunehub.entity.User;

public interface UserService {

	 public String addUser(@RequestBody User user);

}
