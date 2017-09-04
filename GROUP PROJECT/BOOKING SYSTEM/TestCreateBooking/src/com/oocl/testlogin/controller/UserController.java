package com.oocl.testlogin.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.oocl.testlogin.response.UserResponse;
import com.oocl.testlogin.svc.inf.UserSVC;

@RestController
public class UserController {

	private UserSVC userSVC;

	@Autowired(required = true)
	@Qualifier(value = "userService")
	public void setUserService(UserSVC us) {
		this.userSVC = us;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public @ResponseBody UserResponse loginUser(@RequestParam("username") String username, @RequestParam("password") String password ,
			HttpServletRequest request) {		
		return userSVC.getUserLoginResponse(username, password);
	}
}
