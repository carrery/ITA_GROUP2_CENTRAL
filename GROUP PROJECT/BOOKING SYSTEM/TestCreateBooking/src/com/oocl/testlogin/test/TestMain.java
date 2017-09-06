package com.oocl.testlogin.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.oocl.testlogin.dao.impl.UserDAOImpl;
import com.oocl.testlogin.model.Role;
import com.oocl.testlogin.model.User;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("servlet-context.xml");
		UserDAOImpl userDAO = (UserDAOImpl) ctx.getBean("userDAO");
		User user = userDAO.getUserDetails("jag123", "admin");
		Role role = userDAO.getUserRole(user.getRole());
		System.out.println(userDAO.validateUser("jag123", "admin"));
		System.out.println(user.getFirstName());
		System.out.println(role.getAccessUM());
	}

}
