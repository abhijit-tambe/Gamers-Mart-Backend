package com.abhijittambe.gamersmart.backend.restful.webservices.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class UsersResourceController {
	
	RestTemplate restTemplate = new RestTemplate();
	@Autowired
	UsersHardService uHS;
	
	
	@GetMapping(path="/users")
	public List<Users> GetAllUsers() {
		return uHS.findAll();
	}
	
	@PostMapping(path="/create-account")
	public ResponseEntity<Void> createUser( @RequestBody Users user){
		uHS.save(user);
		return ResponseEntity.noContent().build();
	}
	
}
