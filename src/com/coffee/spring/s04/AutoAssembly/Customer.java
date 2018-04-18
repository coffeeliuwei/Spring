/**
 * <p>Title: Customer.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>   
* @author coffeeliu  
* @date 2018-4-9  
* @version 1.0  
 */
package com.coffee.spring.s04.AutoAssembly;

import java.lang.reflect.Constructor;

/**
 * @author coffeeliu
 *
 */
public class Customer {
 private Person person;
 public void setPerson(Person person) {
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
