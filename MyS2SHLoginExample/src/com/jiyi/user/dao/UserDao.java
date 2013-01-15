package com.jiyi.user.dao;

import java.util.List;

import com.jiyi.user.model.User;

public interface UserDao {
	
	public void addUser(User user);
	
	public List getUserList();

}
