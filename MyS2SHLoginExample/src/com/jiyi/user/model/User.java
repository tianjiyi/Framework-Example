package com.jiyi.user.model;

public class User {
	private long userId;
	
	private String name;
	
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj instanceof User){
			User user = (User)obj;
			if(user.getName().equals(name) && user.getPassword().equals(password)){
				return true;
			}else{
				return false;
			}
		}		
		return false;
	}

}
