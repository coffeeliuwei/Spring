/**
 * <p>Title: ProxyFactory.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>   
* @author coffeeliu  
* @date 2018-4-15  
* @version 1.0  
 */
package com.coffee.spring.s06.aop.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author coffeeliu
 *
 */
public class ProxyFactory implements InvocationHandler {
private Object stu;
	/* (non-Javadoc)
	 * @see java.lang.reflect.InvocationHandler#invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[])
	 */
public Object createStudentProxy(Object stu) {
	this.stu = stu;
	return Proxy.newProxyInstance(
			stu.getClass().getClassLoader(), 
			stu.getClass().getInterfaces(), 
			this);
}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		StudentBean s = (StudentBean) stu;
		Object object = null;
		if ((s.getName() != null)&&(s.getAge()>0)&&method.getName().equals("say"))
			object = method.invoke(stu, args);
		else
			System.out.println("不能不填！");
		return object;
	}

}
