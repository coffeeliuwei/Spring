/**
 * <p>Title: StudentImpl.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>   
* @author coffeeliu  
* @date 2018-4-17  
* @version 1.0  
 */
package com.coffee.spring.s07.aop.advice;

/**
 * @author coffeeliu
 *
 */
public class StudentImpl implements IStudent {
     private String name;
     private int age;
     private int StuID;
    
	/**
	 * 
	 */
	public StudentImpl() {
		super();
	}

	/**
	 * @param name
	 * @param age
	 * @param stuID
	 */
	public StudentImpl(String name, int age, int stuID) {
		super();
		this.name = name;
		this.age = age;
		StuID = stuID;
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

	public int getStuID() {
		return StuID;
	}

	public void setStuID(int stuID) {
		StuID = stuID;
	}

	/* (non-Javadoc)
	 * @see com.coffee.spring.s07.aop.advice.IStudent#study(java.lang.String)
	 */
	@Override
	public String study(String name) {
		// TODO Auto-generated method stub
   System.out.println(name+":stude");
   return name+":stude retrun";
	}

	/* (non-Javadoc)
	 * @see com.coffee.spring.s07.aop.advice.IStudent#sleep(java.lang.String)
	 */
	@Override
	public String sleep(String name) {
		// TODO Auto-generated method stub
		System.out.println(name+":sleep");
		return name+":sleep retrun";
	}

	/* (non-Javadoc)
	 * @see com.coffee.spring.s07.aop.advice.IStudent#run(java.lang.String)
	 */
	@Override
	public String run(String name) {
		// TODO Auto-generated method stub
		System.out.println(name+":run");
		return name+":run retrun";
	}

}
