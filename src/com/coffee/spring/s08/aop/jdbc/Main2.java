/**
 * <p>Title: Main.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>   
* @author coffeeliu  
* @date 2018-4-18  
* @version 1.0  
 */
package com.coffee.spring.s08.aop.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coffee.spring.s08.aop.jdbc.dao.UserDao;
import com.coffee.spring.s08.aop.jdbc.dao.UserDaoImpl2;
import com.coffee.spring.s08.aop.jdbc.entity.UserInfo;
import com.coffee.spring.s08.aop.jdbc.entity.UserMapper;

/**
 * @author coffeeliu
 *
 */
public class Main2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ApplicationContext context = 
		             new ClassPathXmlApplicationContext("conf/conf-jdbcAdvice.xml");
		      UserDao userDaoImpl = 
		      (UserDao)context.getBean("UserDao");     
		      System.out.println("------记录创建--------" );
		      userDaoImpl.create("liu111","333","33@.mal","guanzou","china");
		      userDaoImpl.create("liu222","333","22@.mal","g1111zou","c1na");
		      userDaoImpl.create("liu333","333","33@.mal","g111zou","ch11na");
		    
		      System.out.println("------列表显示--------" );
		      List<UserInfo> userMappers = userDaoImpl.listUsers();
		      for (UserInfo record : userMappers) {
		         System.out.print("ID : " + record.getId() );
		         System.out.print(", Name : " + record.getName() );
		         System.out.print(", email : " + record.getEmail() );
		         System.out.print(", ps : " + record.getPassword());
		         System.out.print(",City : " + record.getCity());
		         System.out.println(", Country : " + record.getCountry());
		      }
	}

}
