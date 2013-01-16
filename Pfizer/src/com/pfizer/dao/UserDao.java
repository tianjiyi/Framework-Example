package com.pfizer.dao;
 
import java.util.List;
 
import com.pfizer.model.User;
 
public interface UserDao{
 
	//void addUser(User user);
 
	//List<User> findAllUser();
	
	public boolean login(User user);
 
}