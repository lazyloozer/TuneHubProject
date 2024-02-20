package com.kodnest.tunehub.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodnest.tunehub.entity.User;
import com.kodnest.tunehub.repository.UserRepository;
import com.kodnest.tunehub.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository UserRepository;
	//connect to database and save to database

	public String addUser( User user) {
		UserRepository.save(user);
		return "Record Inserted";

	}
	//logic to check the duplicate email enters present in db
	public boolean emailExists(String email) {
		if(UserRepository.findByEmail(email) !=null) {
			return true;

		}else {
			return false;
		}
	}
	//logic to login to home if password and email matches else return to same page

	public boolean validateUser(String email, String password) {
		if(UserRepository.findByEmail(email) !=null) {
		User user = UserRepository.findByEmail(email);
		String dbpwd = user.getPassword();
		if(password.equals(dbpwd)) {
			return true;
		}else {
			return false;
		}
		
		}
		return false;
	}
}
