package com.coffee.spring.s06.aop.cglib;

import java.lang.reflect.Constructor;

import org.aspectj.weaver.NewConstructorTypeMunger;
import org.springframework.cglib.proxy.Callback;
import org.springframework.cglib.proxy.CallbackFilter;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.NoOp;

public class CGlibProxyFactory {

	Callback[] callbacks = { NoOp.INSTANCE, new SayInterceptor() };
	CallbackFilter filter = new StudentCallbackFilter();

	public Object createProxy(Class targetClass,

	Class[] argTypes, Object[] argObjs) {
        
        
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(targetClass);
		enhancer.setCallbacks(callbacks);
		enhancer.setCallbackFilter(filter);
		return enhancer.create(argTypes, argObjs);

	}
	

}
