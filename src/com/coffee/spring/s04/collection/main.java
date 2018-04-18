/**
 * <p>Title: main.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>   
* @author coffeeliu  
* @date 2018-4-11  
* @version 1.0  
 */
package com.coffee.spring.s04.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author coffeeliu
 *
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"conf/conf-collection.xml");

		customer cust = (customer) context.getBean("CustomerBean");
		System.out.println(cust);

	}

}
