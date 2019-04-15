package com.maven.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maven.domain.User;
import com.maven.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;

	@RequestMapping("hello")
	public String showString() {
		return "hello world";
	}
	
	
	@RequestMapping("user")
	public User showDomain() {
		User u = new User();
		u.setUserId(1);
		u.setUserName("liyi");
		return u;
	}
	
	
	@RequestMapping("allUser")
	public List<User> getAllUser(){
		 return userService.findAllUser();
	}
}
