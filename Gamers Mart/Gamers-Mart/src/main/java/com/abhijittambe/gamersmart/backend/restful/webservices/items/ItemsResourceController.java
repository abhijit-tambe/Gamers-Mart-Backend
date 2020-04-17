package com.abhijittambe.gamersmart.backend.restful.webservices.items;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class ItemsResourceController {
	
	
	@Autowired
	ItemsJpaRepository itemRepository;
	
	@GetMapping(path="/alllistings")
	public List<Items> getAllItemListings(){
		return itemRepository.findAll();
	}

	@GetMapping(path="/users/{username}/mylistings")
	public List<Items> getUserItemListings(@PathVariable String username){
		return itemRepository.findByUserName(username);
	}
	
}
