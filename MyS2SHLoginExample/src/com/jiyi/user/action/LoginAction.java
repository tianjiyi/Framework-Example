package com.jiyi.user.action;

import java.util.List;

import com.jiyi.user.bo.UserBo;
import com.jiyi.user.model.User;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction {
	
	private UserBo userBo;
	private String name;
	private String password;
	private User user;
	
	
	public UserBo getUserBo() {
		return userBo;
	}
	//DI via Spring
	public void setUserBo(UserBo userBo) {
		this.userBo = userBo;
	}
	
	public String login() {
		@SuppressWarnings("unchecked")
		List<User> userList = (List<User>) userBo.getUserList();
		System.out.println(user.getName());
		if (userList.contains(user)) {
			return "SUCCESS";
		}
		return "FAILED";
	}
	
	public String addUser(){
		//User user = new User();
		userBo.addUser(user);
		return "SUCCESS";
	}
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
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

}
