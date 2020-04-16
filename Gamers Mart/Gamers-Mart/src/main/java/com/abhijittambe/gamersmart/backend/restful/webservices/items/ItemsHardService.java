package com.abhijittambe.gamersmart.backend.restful.webservices.items;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class ItemsHardService {

	
	private static List<Items> items = new ArrayList<>();
	private static Long iidNumber=0L;
	
	static {
		items.add(new Items(++iidNumber,"abhijit","Dota 2","Collectible","axe cleaver","bla bla bla",45.5f));
		items.add(new Items(++iidNumber,"abhijit","Dota 2","Collectible","antimage","bla bla bla",45.5f));
		items.add(new Items(++iidNumber,"abhijit1","CS Go","Collectible","desert eagle","bla bla bla",45.9f));
		items.add(new Items(++iidNumber,"abhijit2","CS Go","Collectible","ak 47","bla bla bla",4.9f));
		items.add(new Items(++iidNumber,"abhijit3","Dota 2","Collectible","faceless void","bla bla bla",45.5f));
		items.add(new Items(++iidNumber,"abhijit4","Portal 2","Cd Key","Portal 2","bla bla bla",60f));
	}
	
	
	public List<Items> findAll(){
		return items;
	}
	
	
}
