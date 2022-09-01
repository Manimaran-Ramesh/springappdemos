package com.samples.S09springmvcorm.service;

import java.util.List;

import com.samples.S09springmvcorm.entity.User;

public interface UserService {

	int save(User user);
	
	List<User> getUsers();
	
}