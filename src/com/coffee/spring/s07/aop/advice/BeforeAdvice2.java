/**
 * <p>Title: BeforeAdvice.java</p>  
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
public class BeforeAdvice2 implements MethodBeforeAdvice {

	/* (non-Javadoc)
	 * @see org.springframework.aop.MethodBeforeAdvice#before(java.lang.reflect.Method, java.lang.Object[], java.lang.Object)
	 */
	@Override
	public void before(Method method, Object[] args, Object object)
			throws Throwable {
		System.out.println((String)args[0]+"前置增强2222干些什么。");

	}

}
