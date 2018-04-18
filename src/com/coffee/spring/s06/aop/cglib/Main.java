/**
 * <p>Title: Main.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>   
* @author coffeeliu  
* @date 2018-4-15  
* @version 1.0  
 */
package com.coffee.spring.s06.aop.cglib;

/**
 * @author coffeeliu
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Class[] argTypes = {String.class,Integer.TYPE};
		Object[] argObjs = {"liuwei",18};
		  
		//StudentBean stu=new StudentBean("liuwei", 18);
     StudentBean sBean=(StudentBean) (new CGlibProxyFactory()).
    		 createProxy(StudentBean.class, argTypes, argObjs);
     sBean.say();
     sBean.study();
	}

}
