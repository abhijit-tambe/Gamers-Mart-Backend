package com.abhijittambe.gamersmart.backend.restful.webservices.users;



public class Users {

	
	private int id;
	private String emailId;
	private String userName;
	private String password;
	private Long phoneNumber;
	
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(int id, String emailId, String userName, String password, Long phoneNumber) {
		super();
		this.id = id;
		this.emailId = emailId;
		this.userName = userName;
		this.password = password;
		this.phoneNumber = phoneNumber;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	
	
	
	
}
