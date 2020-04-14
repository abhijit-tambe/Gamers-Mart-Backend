package com.abhijittambe.gamersmart.backend.restful.webservices.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersResources {
	
	@Autowired
	UsersHardService uHS;
	
	
	@GetMapping(path="/users")
	public List<Users> GetAllUsers() {
		return uHS.findAll();
	}
	
}
