package com.jiyi.user.bo;

import java.util.List;

import com.jiyi.user.model.User;

public interface UserBo {
	
	public void addUser(User user);
	
	public List getUserList();

}
