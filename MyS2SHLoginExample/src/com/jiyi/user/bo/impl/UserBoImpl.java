package com.jiyi.user.bo.impl;

import java.util.List;

import com.jiyi.user.bo.UserBo;
import com.jiyi.user.dao.UserDao;
import com.jiyi.user.model.User;

public class UserBoImpl implements UserBo {
	
	private UserDao userDao;

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		userDao.addUser(user);
	}

	@Override
	public List getUserList() {
		// TODO Auto-generated method stub
		
		return userDao.getUserList();
	}

	public UserDao getUserDao() {
		return userDao;
	}
	
	//DI via spring
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

}
