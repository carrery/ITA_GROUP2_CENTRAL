package com.oocl.testlogin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.oocl.testlogin.svc.inf.UserSVC;

@Controller
public class UserController {

	private UserSVC userSVC;

	@Autowired(required = true)
	@Qualifier(value = "userService")
	public void setUserService(UserSVC us) {
		this.userSVC = us;
	}

//	@RequestMapping(value = "/login", method = RequestMethod.POST)
//	public boolean loginUser(@RequestParam("email") String email, @RequestParam("password") String password,
//			HttpServletRequest request) {
//		if (email.isEmpty() && password.isEmpty())
//			return false;
//		boolean result = this.userSVC.validateUser(email, password);
//		return result;
//	}
}
