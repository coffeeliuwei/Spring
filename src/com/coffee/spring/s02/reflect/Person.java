package com.coffee.spring.s02.reflect;

public class Person {

	private String name;
	private int age;
	private String job;
	
	public Person() {
		System.out.println("person!");
	}
    public Person(String name,int age,String job) {
		this.name=name;
		this.age=age;
		this.job=job;
	}
    public void showPerson() {
    			System.out.println("name:"+name+";age:"+age+";job"+job);
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
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
    
}
