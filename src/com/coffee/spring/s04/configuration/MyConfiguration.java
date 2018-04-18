/**
 * <p>Title: Configuration.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>   
* @author coffeeliu  
* @date 2018-4-11  
* @version 1.0  
 */
package com.coffee.spring.s04.configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Scope;
/**
 * @author coffeeliu
 *
 */
@Configuration
@ImportResource("classpath:conf/conf-configuration.xml")
@Import(MyConfigurationPerson.class)

public class MyConfiguration {
 /**
 * 
 */
	
	private Person person;
public MyConfiguration() {
	System.out.println("MyCon Beans!");
}

@Bean
@Scope("prototype")
public Customer customer(){
	return new Customer();
}


}
