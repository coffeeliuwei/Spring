/**
 * <p>Title: StudyInterceptor.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>   
* @author coffeeliu  
* @date 2018-4-15  
* @version 1.0  
 */
package com.coffee.spring.s06.aop.cglib;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

/**
 * @author coffeeliu
 *
 */
public class StudyInterceptor implements MethodInterceptor {

	/* (non-Javadoc)
	 * @see org.springframework.cglib.proxy.MethodInterceptor#intercept(java.lang.Object, java.lang.reflect.Method, java.lang.Object[], org.springframework.cglib.proxy.MethodProxy)
	 */
	@Override
	public Object intercept(Object object, Method method, Object[] args,
			MethodProxy proxy) throws Throwable {
		System.out.println("学习之前干些什么。");
		Object rObject=proxy.invokeSuper(object, args);
		System.out.println("学习之后干些什么。");
		return rObject;
	}

}
