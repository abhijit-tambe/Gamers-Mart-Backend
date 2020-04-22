package com.abhijittambe.gamersmart.backend.restful.webservices.users;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class UsersHardService {

	
	
	private static List<Users> users = new ArrayList<>();
	private static int uidNumber=0;
	
	static {
		users.add(new Users(++uidNumber,"abc@gmail.com","abhijit","tambe","4513265623"));
		users.add(new Users(++uidNumber,"abc@gmail.com","abhijit1","tambe1","4513265623"));
		users.add(new Users(++uidNumber,"abc@gmail.com","abhijit2","tambe2","4513265623"));
		users.add(new Users(++uidNumber,"abc@gmail.com","abhijit3","tambe3","4513265623"));
		users.add(new Users(++uidNumber,"abc@gmail.com","abhijit4","tambe4","4513265623"));
	}
	
	
	public List<Users> findAll(){
		return users;
	}
	
	public Users save(Users user) {
		if(user.getUserId()==-1||user.getUserId()==0) {
			user.setUserId(++uidNumber);
		}else{
			deleteById(user.getUserId());
			users.add(user);
		}
		return user;
	}
	
	public Users findById(long id) {
		for(Users user:users) {
			if(user.getUserId()==id)
				return user;
		}
		return null;
	}
	
	
	public void deleteById(long id) {
		Users user = findById(id);
		users.remove(user);
	}
	
	
}
