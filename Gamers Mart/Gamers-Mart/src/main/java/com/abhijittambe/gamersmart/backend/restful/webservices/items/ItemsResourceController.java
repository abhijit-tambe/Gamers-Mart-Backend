package com.abhijittambe.gamersmart.backend.restful.webservices.items;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemsResourceController {
	
	@Autowired
	ItemsHardService iHS;
	
	@GetMapping(path="/listings")
	public List<Items> getAllItemListings(){
		return iHS.findAll();
	}
	
}
