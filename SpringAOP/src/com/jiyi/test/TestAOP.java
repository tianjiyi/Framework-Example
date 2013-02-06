package com.jiyi.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jiyi.student.IStudent;

public class TestAOP {
	
	public static void main(String[] args){
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		IStudent person = (IStudent)ctx.getBean("student");
		person.addStudent("jiyi");
		
	}

}
