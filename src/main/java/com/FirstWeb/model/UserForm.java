package com.FirstWeb.model;

import java.util.Arrays;

public class UserForm {
	
	private String name;
	private String location;
	private int role_no;
	private String[] hobby;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getRole_no() {
		return role_no;
	}
	public void setRole_no(int role_no) {
		this.role_no = role_no;
	}
	public String[] getHobby() {
		return hobby;
	}
	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}
	@Override
	public String toString() {
		return "UserForm [name=" + name + ", location=" + location + ", role_no=" + role_no + ", hobby="
				+ Arrays.toString(hobby) + "]";
	}
	
	
	

}
