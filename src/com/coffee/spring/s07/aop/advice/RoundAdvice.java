/**
 * <p>Title: RoundAdvice.java</p>  
 * <p>Description: </p>  
 * <p>Copyright: Copyright (c) 2018</p>   
 * @author coffeeliu  
 * @date 2018-4-17  
 * @version 1.0  
 */
package com.coffee.spring.s07.aop.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author coffeeliu
 * 
 */
public class RoundAdvice implements MethodInterceptor {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.aopalliance.intercept.MethodInterceptor#invoke(org.aopalliance.intercept
	 * .MethodInvocation)
	 */
	@Override
	public Object invoke(MethodInvocation i) throws Throwable {
		System.out.println("method " + i.getMethod() + " is called on "
				+ i.getThis() + " with args " + i.getArguments()[0]);
		Object ret = i.proceed();
		System.out.println("method " + i.getMethod() + " returns " + ret);
		return ret;
	}

}
