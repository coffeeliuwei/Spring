/**
 * <p>Title: Main.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>   
* @author coffeeliu  
* @date 2018-4-17  
* @version 1.0  
 */
package com.coffee.spring.s07.aop.advice;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coffee.spring.s06.aop.proxy.studentInterface;



/**
 * @author coffeeliu
 *
 */
public class Main {
public static void main(String[] args) {
	testThrowsAdvice();
}

private static void BeforeAdviceByCode() {
	IStudent stu=new StudentImpl("coffee",20,1);
	BeforeAdvice advice=new BeforeAdvice1();
	BeforeAdvice advice2=new BeforeAdvice2();
	AfterAdvice afterAdvice=new AfterAdvice();
	ProxyFactory pf=new ProxyFactory();
	//pf.setInterfaces(stu.getClass().getInterfaces());
	pf.setOptimize(true);//优化代理模式
	pf.setTarget(stu);
	pf.addAdvice(0,advice2);pf.addAdvice(1,advice);
	pf.addAdvice(afterAdvice);
	
	IStudent proxy=(IStudent) pf.getProxy();
	
	proxy.study("liuwei");
	proxy.sleep("liuwei");
	proxy.run("liuwei");
}

private static void BeforeAdviceByXML() {
	String configPath = "conf/conf-advice.xml";
	ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
	IStudent stu = (IStudent) ctx.getBean("proxy");
	stu.run("liuwei");
	stu.sleep("liuwei");
}

private static void testThrowsAdvice() {
	String configPath = "conf/conf-advice.xml";
	ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
	StudentServer studentServer = (StudentServer)ctx.getBean("ProxFactory");
	
	try{
		studentServer.removeStu(10);
	} catch (Exception e) {}		
	
	try{
		studentServer.updateStu(new StudentImpl("liuwei",10,1) );
	} catch (Exception e) {}			
}
}
