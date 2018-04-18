/**
 * <p>Title: AfterAdvice.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>   
* @author coffeeliu  
* @date 2018-4-17  
* @version 1.0  
 */
package com.coffee.spring.s07.aop.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

/**
 * @author coffeeliu
 *
 */
public class AfterAdvice implements AfterReturningAdvice {

	/* (non-Javadoc)
	 * @see org.springframework.aop.AfterReturningAdvice#afterReturning(java.lang.Object, java.lang.reflect.Method, java.lang.Object[], java.lang.Object)
	 */
	@Override
	public void afterReturning(Object returnoObject, Method method, Object[] args,
			Object object) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println((String)args[0]+"后置增强干些什么。");
	}

}
