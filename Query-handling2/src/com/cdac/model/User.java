package com.cdac.model;

public class User {
	
	private String username;
	  private String password;
	  private String phone;
	   private String email;
	  private String userRole;
	  private String subjectExpert;
	
	  
	  public String getUsername() {
		return username;
	}
	  
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	public String getSubjectExpert() {
		return subjectExpert;
	}
	public void setSubjectExpert(String string) {
		this.subjectExpert = string;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", phone=" + phone + ", email=" + email
				+ ", userRole=" + userRole + ", subjectExpert=" + subjectExpert + "]";
	}
	  
	  

}
