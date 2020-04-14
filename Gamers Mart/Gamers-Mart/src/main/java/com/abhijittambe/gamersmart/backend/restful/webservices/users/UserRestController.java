package com.abhijittambe.gamersmart.backend.restful.webservices.users;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

	
	@GetMapping(path="/")
	public String GetAllUsers() {
		return "users";
	}
	
}
