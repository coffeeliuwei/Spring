/**
 * <p>Title: Customer.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>   
* @author coffeeliu  
* @date 2018-4-9  
* @version 1.0  
 */
package com.coffee.spring.s04.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;



/**
 * @author coffeeliu
 *
 */
@Component("customer")
public class Customer {
	// @Autowired
	// @Qualifier("person")
 private Person person;
 
 
 @Autowired
 //@Qualifier("person")
 public void setPerson(@Qualifier("person")Person person) {
	this.person=person;
}
 /**
 * 
 */
public Customer(Person person) {
	this.person=person;
}
 public void show() {
	System.out.println(person.toString());
}
}
