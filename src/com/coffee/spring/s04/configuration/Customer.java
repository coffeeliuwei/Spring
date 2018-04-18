/**
 * <p>Title: Customer.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>   
* @author coffeeliu  
* @date 2018-4-9  
* @version 1.0  
 */
package com.coffee.spring.s04.configuration;

import java.lang.annotation.Target;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;



/**
 * @author coffeeliu
 *
 */
@Component("customer")
public class Customer {
	 @Autowired
	 @Qualifier("person1")
 private Person person;
 
 
 @Autowired
 @Qualifier("person2")
 public void setPerson(Person person) {
	this.person=person;
}
 /**
 * @return the person
 */
public Person getPerson() {
	return person;
}
 /**
 * 
 */
 @Autowired
 
public Customer(Person person) {
	this.person=person;
}
 /**
 * 
 */
//@Autowired

public Customer() {
	this.person=new Person("默认", 0);
}
public void show() {
	System.out.println(this.getPerson()+":"+person.toString());
}
 public void settest(String s) {
	this.person.setName(s);
	System.out.println(this.person.getName());
}
}
