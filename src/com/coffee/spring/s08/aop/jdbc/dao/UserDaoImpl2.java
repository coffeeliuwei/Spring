/**
 * <p>Title: UserDaoImpl.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>   
* @author coffeeliu  
* @date 2018-4-18  
* @version 1.0  
 */
package com.coffee.spring.s08.aop.jdbc.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import com.coffee.spring.s08.aop.jdbc.entity.UserInfo;
import com.coffee.spring.s08.aop.jdbc.entity.UserMapper;

/**
 * @author coffeeliu
 *
 */
public class UserDaoImpl2 implements UserDao {
	   private JdbcTemplate jdbcTemplateObject;
	/* (non-Javadoc)
	 * @see com.coffee.spring.s08.aop.jdbc.dao.UserDao#setDataSource(javax.sql.DataSource)
	 */
	@Override
	public void setDataSource(DataSource ds) {
		// TODO Auto-generated method stub
	     this.jdbcTemplateObject = new JdbcTemplate(ds);
	}

	/* (non-Javadoc)
	 * @see com.coffee.spring.s08.aop.jdbc.dao.UserDao#create(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public void create(String name, String password, String email, String city,
			String country) {
		 try {
	         String sql1 = "insert into tbl_user (name, password,email) values (?, ?,?)";
	         jdbcTemplateObject.update( sql1, name, password,email);
	        
	         String sql2 = "select max(id) from tbl_user";
	         int sid = jdbcTemplateObject.queryForObject(sql2, Integer.class);
	         String sql3 = "insert into tbl_address(city,country,user_id) " + 
	                       "values (?, ?, ?)";
	         jdbcTemplateObject.update( sql3,city,country,sid);
	         System.out.println("Created Name = " + name);
	         throw new RuntimeException("我故意造一个错误！") ;
	         } catch (DataAccessException e) {
	             System.out.println("回滚了！");
	             throw e;
	          }
	}

	/* (non-Javadoc)
	 * @see com.coffee.spring.s08.aop.jdbc.dao.UserDao#listUsers()
	 */
	@Override
	public List<UserInfo> listUsers() {
		 String SQL = "select * from tbl_user, tbl_address where tbl_user.id=tbl_address.user_id";
	      List <UserInfo> userInfos = jdbcTemplateObject.query(SQL, 
	                                         new UserMapper());
	      return userInfos;
	}

}
