package com.coffee.spring.s08.aop.jdbc.dao;

import java.util.List;

import javax.sql.DataSource;

import com.coffee.spring.s08.aop.jdbc.entity.UserInfo;

public interface UserDao {
	
	
	   public void setDataSource(DataSource ds);

	   public void create(String name,String password,String email,String city,
			   String country);

	   public List<UserInfo> listUsers();
}
