package com.coffee.spring.s06.aop.xml;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


public class StuInterceptor {

	/**
	 * 切入点
	 */
	
	public void printMethod() {
		System.out.println("我是切入点我来啦！");
	}

	
	public void printBeforeAdvice() {
		System.out.println("前置通知!");
	}


        public void log(JoinPoint point, Object returnValue) {
           
            System.out.println("@AfterReturning：目标方法为：" + 
                    point.getSignature().getDeclaringTypeName() + 
                    "|" + point.getSignature().getName());
            System.out.println("@AfterReturning：参数为：" + 
                    Arrays.toString(point.getArgs()));
            System.out.println("@AfterReturning：返回值为：" + returnValue);
            System.out.println("@AfterReturning：被织入的目标对象为：" + point.getTarget());
            
        }

	public void finallyAdvice() {
		System.out.println("最终通知()!");
	}

	public Object printAroundAdvice(ProceedingJoinPoint pjp, String name)
			throws Throwable {
		Object result = null;
		if (name.equals("coffeeliu"))
			pjp.proceed();
		else
			System.out.println("print()被拦截...");
		return result;
	}
}
