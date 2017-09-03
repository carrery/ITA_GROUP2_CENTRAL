package com.oocl.testlogin.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oocl.testlogin.dao.impl.UserDAOImpl;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("servlet-context.xml");
		UserDAOImpl userDAO = (UserDAOImpl) ctx.getBean("userDAO");
		System.out.println(userDAO.validateUser("jag123", "password12345"));
		
	}

}
