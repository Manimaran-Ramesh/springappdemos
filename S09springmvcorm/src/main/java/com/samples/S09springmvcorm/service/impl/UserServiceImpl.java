package com.samples.S09springmvcorm.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.samples.S09springmvcorm.dao.UserDao;
import com.samples.S09springmvcorm.entity.User;
import com.samples.S09springmvcorm.service.UserService;

@Component("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userdao;

	@Override
	@Transactional
	public int save(User user) {
		return userdao.create(user);
	}

	@Override
	public List<User> getUsers() {
		return userdao.findUsers();
	}
	
}