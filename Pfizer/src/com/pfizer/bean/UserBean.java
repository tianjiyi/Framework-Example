package com.pfizer.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.pfizer.bo.UserBo;
import com.pfizer.model.User;

@ManagedBean (name="user")
@SessionScoped
public class UserBean implements Serializable{
 
	@ManagedProperty(value="#{userBo}")
	//DI via Spring
	UserBo userBo;
	
	public final static String AUTH_KEY="user_name";
	
	public String username;
	
	public String password;
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setUserBo(UserBo userBo) {
		this.userBo = userBo;
	}
	
	//user login
	
	public String login(){
		User user = new User();
		user.setUsername(getUsername());
		user.setPassword(getPassword());
		System.out.println("username:" + getUsername());
		if (userBo.login(user)) {
			FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put(
			        AUTH_KEY, username);
			return "valid";
		}
		return "invalid";
	}
	
	public String logout() {
	    FacesContext.getCurrentInstance().getExternalContext().getSessionMap()
	        .remove(AUTH_KEY);
	    return null;
	  }
 
	//get all customer data from database
	/*
	public List<User> getUserList(){
		return userBo.findAllUser();
	}
	
	//add a new customer data into database
	public String addCustomer(){
		
		User user = new User();
		cust.setUsername(getName());
		cust.setPassword(getPassword());
		
		userBo.addUser(user);
		
		clearForm();
		
		return "";
	}
	
	//clear form values
	private void clearForm(){
		setName("");
		setAddress("");
	}
	*/
	
}
