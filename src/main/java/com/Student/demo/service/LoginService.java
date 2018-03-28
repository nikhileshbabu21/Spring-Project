package com.Student.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Student.demo.dao.UserDao;
import com.Student.demo.pojo.User;


@Service
public class LoginService {
	@Autowired
private UserDao userDao;
	public Boolean isValidUser(String username, String password){
		
		User user = userDao.findbyUsernameAndPassword(username, password);
	
				
				if(user==null){
					return false;
				}else{
					
					return true;
				}
		
	}
	
}
