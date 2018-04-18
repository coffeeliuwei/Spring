package com.coffee.spring.s01;

import java.io.IOException;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

/**
 * @author coffeeliu
 *Resource接口
 方法：
boolean exists()
boolean isOpen() 
URL getURL() 
File getFile() 
InputStream getInputStream()
实现类：
ByteArrayResource 
ClassPathResource 
FileSystemResource 
InputStreamResource 
ServletContextResource 
UrlResource
资源类型地址前缀：
classpath  classpath:com/coffee/bean.xml
File file:/com/coffee/bean.xml
http http://www.coffee.com/bean.xml
ftp ftp://www.coffee.com/bean.xml
无前缀 com/coffee/bean.xml
Ant风格的匹配符：
？：匹配文件名中的一个字符 
*：匹配文件名中的任意字符
**：匹配多层路径
*类体系结构：
XmlBeanFactory
ListableBeanFactory
HierarhicalBeanFactory
ConfigurableBeanFactory
AutowireCapableBeanFactory
SingletonBeanFactory
BeanDefinitionRegistry
//////////////
ApplicationContext:
实现类：
ClassPathXmlApplicationContext
FileSystemXmlApplicationContext
ConfigurableApplicationContext
 */
public class main {

	public static void main(String[] args) throws IOException {
		
		//Resource rs=new ClassPathResource("HelloMessage.xml");
		//BeanFactory f = new XmlBeanFactory(rs);	
	  BeanFactory factory=new ClassPathXmlApplicationContext("classpath*:Hello*.xml");
      Person person=(Person) factory.getBean("person",Person.class);
      
      
      String s=person.sayHello();
      System.out.println(s);
      
	}

}
