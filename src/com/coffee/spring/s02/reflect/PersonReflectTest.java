package com.coffee.spring.s02.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
/**
 * 
 * @author coffeeliu
 工作机制：
装载：查找和导入Class文件
链接：执行校验，准备和解析步骤
初始化：对类的静态变量、静态代码块执行初始化工作
重要方法：
Class loadClass（String name）
Class defineClass(String name, byte[]b, int off,int len)
Class findSystemClass(String name)
Class findLoadedClass(String name)
ClassLoader getParent()
三个反射类：
Constructor
Method
--Class getReturnType()
--Class[] getParameterTypes()
--Class[] getExceptionTypes()
--Annotation[][] getParameterAnnotations()
Field
 */
public class PersonReflectTest {
	@SuppressWarnings("all")
	public static Person initByDefault() throws Throwable{
		//1.通过类装载器获取类对象.classpath
		ClassLoader loader = Thread.currentThread().getContextClassLoader();		
		Class Cperson = loader.loadClass("com.coffee.spring.s02.reflect.Person");
		//Class Cperson = loader.loadClass("Person");
	
		//2.获取类的默认构造器对象并实例化
		Constructor cons = Cperson.getDeclaredConstructor((Class[])null);
		Person person = (Person)cons.newInstance();
		
		//3.通过反射方法设置属性
		Method setName = Cperson.getMethod("setName",String.class);		
		setName.invoke(person,"刘伟");		
		Method setAge = Cperson.getMethod("setAge",int.class);
		setAge.invoke(person,18);		
		Method setJob = Cperson.getMethod("setJob",String.class);
		setJob.invoke(person,"教师");		
		return person;
	}
	
	@SuppressWarnings("all")
	public static Person initByParam()  throws Throwable{
		//1.通过类装载器获取Person类对象.父类classloader
		
		//ClassLoader loader = Thread.currentThread().getContextClassLoader();
		ClassLoader loader =Person.class.getClassLoader();
		Class CPerson = loader.loadClass("com.coffee.spring.s02.reflect.Person");
		//Class CPerson = loader.loadClass("Person");
		
		//2.获取类的带有参数的构造器对象
		Constructor cons = CPerson.getDeclaredConstructor(new Class[]{String.class,int.class,String.class});
		
		//3.使参数的构造器对象实例化Person
		Person person = (Person)cons.newInstance(new Object[]{"刘伟",20,"程序猿"});
		return person;	
	}
	
	
	
	
	public static void main(String[] args) throws Throwable {
		Person p1 = initByDefault();
		Person p2 = initByParam();
		p1.showPerson();
		p2.showPerson();
		/////////////////////////////
		/**
		 * Class<?> c=Class.forName("com.coffee.spring.s01.Person");
		ClassLoader loader2=c.getClassLoader();
		System.out.println(loader2);
		ClassLoader loader=Person.class.getClassLoader();
		System.out.println(loader);
		ClassLoader loader1 = Thread.currentThread().getContextClassLoader();
		System.out.println("current loader:"+loader1);
		System.out.println("parent loader:"+loader1.getParent());
		System.out.println("grandparent loader:"+loader1.getParent().getParent());
		 * 
		 */
	    

	}

}
