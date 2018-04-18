/**
 * <p>Title: StudentCallbackFilter.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>   
* @author coffeeliu  
* @date 2018-4-15  
* @version 1.0  
 */
package com.coffee.spring.s06.aop.cglib;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.CallbackFilter;

/**
 * @author coffeeliu
 *
 */
public class StudentCallbackFilter implements CallbackFilter {

	/* (non-Javadoc)
	 * @see org.springframework.cglib.proxy.CallbackFilter#accept(java.lang.reflect.Method)
	 */
	@Override
	public int accept(Method method) {
		if(method.getName().equals("study")){
			return 0;
		}
		return 1;
	}

}
