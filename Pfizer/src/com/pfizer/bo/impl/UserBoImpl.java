package com.pfizer.bo.impl;
 
import java.util.List;
 
import com.pfizer.bo.UserBo;
import com.pfizer.dao.UserDao;
import com.pfizer.model.User;
 
public class UserBoImpl implements UserBo{
 
	UserDao userDao;
 
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
 
	/*
	public void addUser(User user){
 
		userDao.addUser(user);
 
	}
 
	public List<User> findAllUser(){
 
		return userDao.findAllUser();
	}
	*/
	public boolean login(User user){
		return userDao.login(user);
	}
}