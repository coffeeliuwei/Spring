/**
 * <p>Title: BeforeAdvice1.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>   
* @author coffeeliu  
* @date 2018-4-17  
* @version 1.0  
 */
package com.coffee.spring.s07.aop.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

/**
 * @author coffeeliu
 *
 */
public class BeforeAdvice1 implements MethodBeforeAdvice {

	/* (non-Javadoc)
	 * @see org.springframework.aop.MethodBeforeAdvice#before(java.lang.reflect.Method, java.lang.Object[], java.lang.Object)
	 */
	@Override
	public void before(Method arg0, Object[] args, Object arg2)
			throws Throwable {
		// TODO Auto-generated method stub
		System.out.println((String)args[0]+"前置增强1111干些什么。");
	}

}
