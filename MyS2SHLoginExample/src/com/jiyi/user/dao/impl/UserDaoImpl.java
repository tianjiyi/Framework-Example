package com.jiyi.user.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.jiyi.user.dao.UserDao;
import com.jiyi.user.model.User;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao{

	@Override
	public void addUser(User user) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(user);
		
	}

	@Override
	public List getUserList() {
		// TODO Auto-generated method stub
		return getHibernateTemplate().find("from User");		
	}
	
	
}
