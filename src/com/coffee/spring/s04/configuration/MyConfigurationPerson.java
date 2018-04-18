/**
 * <p>Title: MyConfigurationPerson.java</p>  
* <p>Description: </p>  
* <p>Copyright: Copyright (c) 2018</p>   
* @author coffeeliu  
* @date 2018-4-11  
* @version 1.0  
 */
package com.coffee.spring.s04.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author coffeeliu
 *
 */
@Configuration
public class MyConfigurationPerson {
	@Bean(name="person",initMethod="init",destroyMethod="die")
	//@Scope("prototype")
	public Person person(){
		
		return new Person("LW2",28);
		
	}
}
