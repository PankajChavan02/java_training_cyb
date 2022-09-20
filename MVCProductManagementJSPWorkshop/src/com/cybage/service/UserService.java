package com.cybage.service;



import com.cybage.dao.UserDao;
import com.cybage.model.User;

public class UserService {
	
	public static UserDao userDao = new UserDao();
	
	public User getUsersByNameAndPassword(String name,String password){		
		return userDao.getUsers(name,password);
		
	}

}
