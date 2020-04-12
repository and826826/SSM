package com.ssm.service.impl;

import com.ssm.pojo.employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.mapper.UserMapper;
import com.ssm.service.UserDaoService;

@Service
public class UserDaoServiceImple implements UserDaoService{

	@Autowired
	UserMapper mapper;
	
	@Override
	public employee findOne() {
		employee  user = mapper.findOne();
		return user;
	}

}
