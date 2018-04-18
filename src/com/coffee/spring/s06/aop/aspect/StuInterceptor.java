package com.coffee.spring.s06.aop.aspect;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class StuInterceptor {

	/**连接点：程序执行的某个特定位置，比如类初始化前，初始化后，方法调用前，方法调用后等等
	 * 切入点：通过切点来定位特定的连接点
	 * 增强：织入到目标类连接点上的一段程序代码
                       目标对象：增强逻辑的织入目标类
                       引介： 引介是一种特殊的增强，它为类添加一些属性和方法
                       织入：将增强添加对目标类的具体连接点上的过程
                      代理：一个类被AOP织入增强后，会产生一个结果类，该类融合了原类和增强逻辑的代理类
                      切面：由切点和增强组成，既包括了横切逻辑的定义，也包括了连接点的定义
	 */
	@Pointcut("execution(* com.coffee.spring.s06.aop.aspect.Student.*(..))")
	// @Pointcut("execution(* com.coffee.spring.s06.aop.aspect.Student.*(..))")
	public void printMethod() {
		System.out.println("我是切入点我来啦！");
	}

	@Before("printMethod()")
	public void printBeforeAdvice() {
		System.out.println("前置通知!");
	}

    @AfterReturning(pointcut="printMethod()", 
            returning="returnValue")
        public void log(JoinPoint point, Object returnValue) {
           
            System.out.println("@AfterReturning：目标方法为：" + 
                    point.getSignature().getDeclaringTypeName() + 
                    "|" + point.getSignature().getName());
            System.out.println("@AfterReturning：参数为：" + 
                    Arrays.toString(point.getArgs()));
            System.out.println("@AfterReturning：返回值为：" + returnValue);
            System.out.println("@AfterReturning：被织入的目标对象为：" + point.getTarget());
            
        }

	@After("printMethod()")
	public void finallyAdvice() {
		System.out.println("最终通知()!");
	}

	@Around("printMethod() && args(name)")
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
