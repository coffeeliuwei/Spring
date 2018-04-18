/**
 * <p>Title: Person.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>   
* @author coffeeliu  
* @date 2018-4-9  
* @version 1.0  
 */
package com.coffee.spring.s04.AutoAssembly;

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
}
@Override
public String toString() {
	return "Person [name=" + name + ", age=" + age + "]";
}

}
