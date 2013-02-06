package com.jiyi.aop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jiyi.aop.IEmployee;

public class TestAOP {
	public static void main(String[] args){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		IEmployee emp = (IEmployee)ctx.getBean("employee");
		emp.signIn();
	}
}
