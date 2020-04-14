package com.abhijittambe.gamersmart.backend.restful.webservices.items;

public class Items {

	
	private int itemId;
	private String userName;
	private String gameName;
	private String type;
	private String itemName;
	private String description;
	private float price;
	
	
	
	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Items(int itemId, String userName, String gameName, String type, String itemName, String description,
			float price) {
		super();
		this.itemId = itemId;
		this.userName = userName;
		this.gameName = gameName;
		this.type = type;
		this.itemName = itemName;
		this.description = description;
		this.price = price;
	}



	public int getItemId() {
		return itemId;
	}



	public void setItemId(int itemId) {
		this.itemId = itemId;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getGameName() {
		return gameName;
	}



	public void setGameName(String gameName) {
		this.gameName = gameName;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public String getItemName() {
		return itemName;
	}



	public void setItemName(String itemName) {
		this.itemName = itemName;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public float getPrice() {
		return price;
	}



	public void setPrice(float price) {
		this.price = price;
	}



	
	
	
	
}
