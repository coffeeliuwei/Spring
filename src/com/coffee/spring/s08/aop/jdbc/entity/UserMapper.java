/**
 * <p>Title: UserMapper.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>   
* @author coffeeliu  
* @date 2018-4-18  
* @version 1.0  
 */
package com.coffee.spring.s08.aop.jdbc.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

/**
 * @author coffeeliu
 *
 */
public class UserMapper implements RowMapper<UserInfo> {
	 public UserInfo mapRow(ResultSet rs, int rowNum) throws SQLException {
		 UserInfo userInfo = new UserInfo();
		 userInfo.setId(rs.getInt("id"));
		 userInfo.setName(rs.getString("name"));
		 userInfo.setEmail(rs.getString("email"));
		 userInfo.setPassword(rs.getString("password"));
		 userInfo.setCity(rs.getString("city"));
	      userInfo.setCountry(rs.getString("country"));
	      return userInfo;
	   }
}
