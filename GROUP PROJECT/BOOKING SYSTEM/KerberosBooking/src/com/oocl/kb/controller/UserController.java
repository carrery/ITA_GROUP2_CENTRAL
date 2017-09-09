package com.oocl.kb.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.oocl.kb.response.UpdateUserResponse;
import com.oocl.kb.response.UserLoginResponse;
import com.oocl.kb.svc.inf.UserSVC;

@RestController
public class UserController {

	// @Autowired(required = true)
	private UserSVC userSVC;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public @ResponseBody UserLoginResponse loginUser(@RequestParam("username") String username,
			@RequestParam("password") String password, HttpServletRequest request) {
		return userSVC.getUserLoginResponse(username, password);
	}

	@RequestMapping(value = "/deleteUser", method = RequestMethod.POST)
	public @ResponseBody int deleteUser(@RequestParam("username") String username, HttpServletRequest request) {
		return userSVC.deleteUser(username);
	}

	@RequestMapping(value = "/updateUser", method = RequestMethod.POST)
	public @ResponseBody UpdateUserResponse updateUser(@RequestParam("username") String username,
			@RequestParam("password") String password, @RequestParam("role") String role,
			@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName,
			@RequestParam("email") String email, @RequestParam("contactNo") String contactNo,
			@RequestParam("isDeleted") int isDeleted, HttpServletRequest request) {
		return userSVC.updateUser(username, password, role, firstName, lastName, email, contactNo);
	}

	@RequestMapping(value = "/createUser", method = RequestMethod.POST)
	public @ResponseBody int createUser(@RequestParam("username") String username,
			@RequestParam("password") String password, @RequestParam("role") String role,
			@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName,
			@RequestParam("email") String email, @RequestParam("contactNo") String contactNo,
			HttpServletRequest request) {
		return userSVC.createUser(username, password, role, firstName, lastName, email, contactNo);
	}
}
