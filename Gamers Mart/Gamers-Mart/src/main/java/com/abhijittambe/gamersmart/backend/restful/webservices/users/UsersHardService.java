//package com.abhijittambe.gamersmart.backend.restful.webservices.users;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.abhijittambe.gamersmart.backend.restful.jwt.JwtInMemoryUserDetailsService;
//
//import io.jsonwebtoken.lang.Arrays;
//@Service
//public class UsersHardService {
//	@Autowired
//	JwtInMemoryUserDetailsService jwtInMemory;
//	
//	private static ArrayList<Users> users = new ArrayList<>();
//	private static Long uidNumber=0L;
//		
//		
////		users.add(new Users(++uidNumber,"abc@gmail.com","abhijit","tambe","4513265623"));
////		users.add(new Users(++uidNumber,"abc@gmail.com","abhijit1","tambe1","4513265623"));
////		users.add(new Users(++uidNumber,"abc@gmail.com","abhijit2","tambe2","4513265623"));
////		users.add(new Users(++uidNumber,"abc@gmail.com","abhijit3","tambe3","4513265623"));
////		users.add(new Users(++uidNumber,"abc@gmail.com","abhijit","tambe","4513265623"));
////	}
//	
//	
////	public void add() {
////		
////			jwtInMemory.addUser(uidNumber, "abhijit3", "tambe3");
////		
////	}
//	
//	
//	public List<Users> findAll(){
//		return users;
//	}
//	
//	public Users save(Users user) {
//		if(user.getUserId()==null||user.getUserId()==0) {
//			user.setUserId(++uidNumber);
//			users.add(user);
//			jwtInMemory.addUser(uidNumber, user.getUserName(), user.getPassword());
//		}else{
//			deleteById(user.getUserId());
//			users.add(user);
//		}
//		return user;
//	}
//	
//	public Users findById(Long id) {
//		for(Users user:users) {
//			if(user.getUserId()==id)
//				return user;
//		}
//		return null;
//	}
//	
//	
//	public void deleteById(Long id) {
//		Users user = findById(id);
//		users.remove(user);
//	}
//	
//	
//}
