package com.cybage.servlet.assignment2.service;

import com.cybage.servlet.assignment2.dao.UserDao;
import com.cybage.servlet.assignment2.model.User;

public class UserService {
	
	public static UserDao userDao = new UserDao();
	
	public User getUserFromDb(User user) {
		System.out.println("inside get user service ");
		return userDao.getUser(user);
	}
	
	
	public boolean AddUser(User user) {
		return userDao.AddUser(user);
	}

}
