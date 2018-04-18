/**
 * <p>Title: Person.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>   
* @author coffeeliu  
* @date 2018-4-9  
* @version 1.0  
 */
package com.coffee.spring.s04.component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

/**
 * @author coffeeliu
 *
 */
public class Person {
private String name;
private int age;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
/**
 * @param name
 * @param age
 */
public Person(String name, int age) {
//	super();
	this.name = name;
	this.age = age;
	System.out.println(name+"我有名字啦！");
}
@Override
public String toString() {
	return "Person [name=" + name + ", age=" + age + "]";
}
@PostConstruct
public void init() {
	System.out.println(name+"我活啦！");
}
@PreDestroy
public void die() {
	System.out.println(name+"我死啦！");
}
}
