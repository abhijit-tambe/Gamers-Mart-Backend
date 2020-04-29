package com.abhijittambe.gamersmart.backend.restful.webservices.item;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class ItemResourceController {
	
	
	@Autowired
	ItemJpaRepository itemRepository;
	
	@GetMapping(path="/items/alllistings")
	public List<Item> getAllItemListings(){
		return itemRepository.findAll();
	}
	

	@GetMapping(path="/items/{username}/mylistings")
	public List<Item> getUserItemListings(@PathVariable String username){
		return itemRepository.findByUserName(username);
	}
	
	@DeleteMapping(path="/items/{username}/delete/{itemid}")
	public ResponseEntity<Void> deleteUserItem(@PathVariable String username, @PathVariable Long itemid){
		Item deleteItem = itemRepository.getOne(itemid);
		itemRepository.delete(deleteItem);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@PostMapping(path="/items/{username}/add")
	public ResponseEntity<Void> addUserItem(@PathVariable String username,@RequestBody Item item){
		item.setUserName(username);
		itemRepository.save(item);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@PutMapping(path="/items/{username}/update/{itemid}")
		public ResponseEntity<Void> updateUserItem(@PathVariable String username, @PathVariable Long itemid, @RequestBody Item item){
			Item updateItem = itemRepository.getOne(itemid);
			updateItem.setDescription(item.getDescription());
			updateItem.setPrice(item.getPrice());
			itemRepository.save(updateItem);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}	
	
	@GetMapping(path="/items/{username}/buy/{itemid}")
	public ResponseEntity<Void> buyItems(@PathVariable String username, @PathVariable Long itemid){
		Item boughtItem = itemRepository.getOne(itemid);
		boughtItem.setUserName(username);
		itemRepository.save(boughtItem);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	
	
}
