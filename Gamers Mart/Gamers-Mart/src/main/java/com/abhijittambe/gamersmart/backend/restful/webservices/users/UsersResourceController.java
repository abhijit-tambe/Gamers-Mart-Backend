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

import com.abhijittambe.gamersmart.backend.restful.jwt.JwtInMemoryUserDetailsService;



@RestController
@CrossOrigin(origins="http://localhost:3000")
public class UsersResourceController {

	@Autowired
	UserJpaRepository userJpaRepository;
	@Autowired
	JwtInMemoryUserDetailsService jwtInMemory;
	
	@GetMapping(path="/")
	public ResponseEntity<Void> initialise() {
		List<Users> users= userJpaRepository.findAll();
			for(Users u:users) {
				jwtInMemory.addUser(u.getUserId(),u.getUserName(),u.getPassword());
			}
			System.out.println("initialization complete");
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@GetMapping(path="/user/allusers")
	public List<Users> GetAllUsers() {
		return userJpaRepository.findAll();
	}
	
	@PostMapping(path="/user/create-account")
	public ResponseEntity<Void> createUser( @RequestBody Users user){
		Users userCreated= userJpaRepository.save(user);
		jwtInMemory.addUser(userCreated.getUserId(),userCreated.getUserName(),userCreated.getPassword());
		if(userCreated.getUserId()!=0||user.getUserId()!=-1)
		return new ResponseEntity<Void>(HttpStatus.OK);
		else
		return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
	}
	
	@PostMapping(path="/user/acs")
	public String dasdas(){
		return "works";
	}
	
}
