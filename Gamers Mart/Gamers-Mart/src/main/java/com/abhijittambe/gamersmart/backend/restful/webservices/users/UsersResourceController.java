package com.abhijittambe.gamersmart.backend.restful.webservices.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
@CrossOrigin(origins="http://localhost:3000")
public class UsersResourceController {
	
//	RestTemplate restTemplate = new RestTemplate();
	@Autowired
	UsersHardService uHS;
	
	
	@GetMapping(path="/user/allusers")
	public List<Users> GetAllUsers() {
		return uHS.findAll();
	}
	
	@PostMapping(path="/user/create-account")
	public ResponseEntity<Void> createUser( @RequestBody Users user){
		
		
		Users updateuser= uHS.save(user);
		System.out.print(updateuser.getUserId());
//		System.out.println("user email"+user.getUserId());
//		if(user.getUserId()!=0||user.getUserId()!=-1)
		return new ResponseEntity<Void>(HttpStatus.OK);
//		else
//		return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
	}
	
	@PostMapping(path="/user/acs")
	public String dasdas(){
		return "works";
	}
}
