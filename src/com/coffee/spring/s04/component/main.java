/**
 * <p>Title: main.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>   
* @author coffeeliu  
* @date 2018-4-9  
* @version 1.0  
 */
package com.coffee.spring.s04.component;

import org.springframework.beans.factory.BeanFactory;
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
		BeanFactory beanFactory = 
				new ClassPathXmlApplicationContext("conf/conf-component.xml");
		Customer sCustomer = beanFactory.getBean("customer", Customer.class);
	
		sCustomer.show();
		
    
	}

}
