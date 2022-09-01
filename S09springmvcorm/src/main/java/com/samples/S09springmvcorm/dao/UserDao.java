package com.samples.S09springmvcorm.dao;

import java.util.List;

import com.samples.S09springmvcorm.entity.User;

public interface UserDao {

	int create(User user);
	
	List<User> findUsers();
	
}