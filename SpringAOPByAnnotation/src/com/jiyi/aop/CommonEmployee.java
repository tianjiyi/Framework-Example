package com.jiyi.aop;

public class CommonEmployee implements IEmployee {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void signIn() {
		// TODO Auto-generated method stub
		System.out.println("Employee: "+name+" has signed in");
	}
	
	

}
