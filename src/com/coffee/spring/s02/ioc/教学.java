package com.coffee.spring.s02.ioc;
/**
 * @author coffeeliu
 * 构造函数注入
属性注入
接口注入
 */
public class 教学 {
 public void teaching() {
	IJava教师  t=new liuwei();
	I任课 r=new IT课程体系();
	/////////两种方式////////
	r.injectJavaTeacher(t);
	((IT课程体系) r).TeachJava();
	/////////////////////////
	IT课程体系  it=new IT课程体系();
	it.setJt(t);
	it.TeachJava();
}
}
