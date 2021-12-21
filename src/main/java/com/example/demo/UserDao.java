package com.example.demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;


@Repository
public class UserDao {
	
	Logger logger=LoggerFactory.getLogger(UserDao.class);
	
	public void save()
	{
		logger.debug("**Save()::Method Execution Started**");
		logger.info("**Record Inserted**");
		logger.debug("**Save()::Method Execution Completed**");
		
	}

}
