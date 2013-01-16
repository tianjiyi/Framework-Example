package com.pfizer.dao.impl;
 
import java.util.Date;
import java.util.List;
 
import com.pfizer.dao.UserDao;
import com.pfizer.model.User;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.orm.hibernate3.*;
 
public class UserDaoImpl extends 
       HibernateDaoSupport implements UserDao{
 
	/*
	public void addUser(User user){
 
		
		getHibernateTemplate().save(user);
 
	}
 
	public List<User> findAllUser(){
 
		return getHibernateTemplate().find("from User");
 
	}
	
	*/
	public boolean login(User user){
		
		//getHibernateTemplate().find("from Customer");
		List validUsers = this.getHibernateTemplate().findByNamedParam(
		        "from User "
		            + "where username = :username "
		            + "and password = :password",
		        new String[] { "username", "password" },
		        new String[] { user.getUsername(), user.getPassword() });
		if(validUsers.isEmpty()){
			return false;
		}
		return true;
	}
}