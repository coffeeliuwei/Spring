/**
 * <p>Title: StudentServer.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>   
* @author coffeeliu  
* @date 2018-4-18  
* @version 1.0  
 */
package com.coffee.spring.s07.aop.advice;

import java.sql.SQLException;



/**
 * @author coffeeliu
 *
 */
public class StudentServer {
  public void removeStu(int stuid) {
	//
	  throw new RuntimeException( "删除了！整个人都不好拉！");
}
  public void updateStu(IStudent stu) throws Exception {
	  //
	throw new SQLException("修改了！整个人都不好啦！");
}
}
