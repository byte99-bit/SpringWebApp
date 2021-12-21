package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private UserDao userdao;
	
	Logger logger=LoggerFactory.getLogger(UserService.class);
	
	public void saveUser()
	{
		logger.info("**saveUser()::Method Execution Started**");
		userdao.save();
		logger.info("**saveUser()::Method Execution Started**");
	}

}
