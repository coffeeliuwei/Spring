/**
 * <p>Title: Main.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>   
* @author coffeeliu  
* @date 2018-4-15  
* @version 1.0  
 */
package com.coffee.spring.s06.aop.proxy;

/**
 * @author coffeeliu
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		studentInterface s1 = new StudentBean("liuwei",18);
		ProxyFactory factory = new ProxyFactory();
		studentInterface s2 = 
				(studentInterface)factory.createStudentProxy(s1);

		s2.printName();s2.say();

	}

}
