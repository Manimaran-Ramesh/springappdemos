package com.samples.S09springmvcorm.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.samples.S09springmvcorm.dao.UserDao;
import com.samples.S09springmvcorm.entity.User;

@Component
public class UserDaoImpl implements UserDao{

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public int create(User user) {
		return (int) hibernateTemplate.save(user);
	}

	@Override
	public List<User> findUsers() {
		return hibernateTemplate.loadAll(User.class);
	}
	
}