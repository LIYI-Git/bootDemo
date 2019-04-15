package com.maven.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maven.domain.User;
import com.maven.mapper.UserMapper;
import com.maven.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserMapper mapper;

	@Override
	public List<User> findAllUser() {
		
		List<User> list = mapper.findAllUser();
		
		return list;
	}

}
