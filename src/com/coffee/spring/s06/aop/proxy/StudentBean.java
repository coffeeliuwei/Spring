/**
 * <p>Title: StudentBean.java</p>  
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
public class StudentBean implements studentInterface {
 private String name;
 private int age;
	/* (non-Javadoc)
	 * @see com.coffee.spring.s06.aop.proxy.studentInterface#printName()
	 */
	@Override
	public void printName() {
		System.out.println(name);

	}

	/* (non-Javadoc)
	 * @see com.coffee.spring.s06.aop.proxy.studentInterface#say()
	 */
	@Override
	public void say() {
		System.out.println("info:["+name+","+age+"]");

	}

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
	 * 
	 */
	public StudentBean() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param age
	 */
	public StudentBean(String name, int age) {
		//super();
		this.name = name;
		this.age = age;
	}

}
