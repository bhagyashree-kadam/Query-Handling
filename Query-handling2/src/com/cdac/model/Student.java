package com.cdac.model;

public class Student extends Login{
	
	 private int stud_id;
	 private String userName;
	
	 @Override
	public String toString() {
		return "Student [stud_id=" + stud_id + ", userName=" + userName + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getStud_id() {
		return stud_id;
	}
	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	

}
