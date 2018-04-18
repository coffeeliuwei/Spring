package com.coffee.spring.s06.aop.aspect;

public class Student {

		    private String name;
		    private int age;

		   public String study(){
			   
		   	System.out.println("study:["+name+","+age+"]");
		   	return "study:["+name+","+age+"]";
		   }


		   	public String say() {
		   		System.out.println("say:["+name+","+age+"]");
		   		return "say:["+name+","+age+"]";

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
		   	public Student() {
		   		// TODO Auto-generated constructor stub
		   	}

		   	/**
		   	 * @param name
		   	 * @param age
		   	 */
		   	public Student(String name, int age) {
		   		//super();
		   		this.name = name;
		   		this.age = age;
		   	}


}
