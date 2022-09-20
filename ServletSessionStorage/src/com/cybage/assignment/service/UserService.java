package com.cybage.assignment.service;

import com.cybage.assignment.dao.UserDao;
import com.cybage.assignment.model.User;

public class UserService {
	public static UserDao userDao = new UserDao();
	
	
	public User getUserFromDb(User user) {
		System.out.println("inside get user service ");
		return userDao.getUser(user);
	}

}
