package com.abhijittambe.gamersmart.backend.restful.webservices.users;



public class Users {

	
	private Long userId;
	private String emailId;
	private String userName;
	private String password;
	private String phoneNumber;
	
	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Users(Long userId, String emailId, String userName, String password, String phoneNumber) {
		super();
		this.userId = userId;
		this.emailId = emailId;
		this.userName = userName;
		this.password = password;
		this.phoneNumber = phoneNumber;
	}
	
	
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
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
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	
	
	
	
}
