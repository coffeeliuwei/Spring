/**
 * <p>Title: main.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>   
* @author coffeeliu  
* @date 2018-4-9  
* @version 1.0  
 */
package com.coffee.spring.s04.configuration;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
	ApplicationContext context=new AnnotationConfigApplicationContext(MyConfiguration.class);
	Customer customer=(Customer)context.getBean("customer");
	customer.show();
		
	Customer customer2=(Customer)context.getBean("customer");
	customer2.show();
	customer.settest("kljlkj");
	customer.show();customer2.show();
	}

}
