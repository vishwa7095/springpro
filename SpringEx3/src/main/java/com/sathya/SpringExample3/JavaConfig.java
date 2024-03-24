package com.sathya.SpringExample3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class JavaConfig {
	@Bean
	public Person person1()
	{
		Person person1=new Person();
		person1.setName( "viswa");
		person1.setEmail("viswa@email.com");
		return person1;
	}
	@Bean
	public Person person2()
	{
		Person person2=new Person();
		person2.setName( "manikanta");
		person2.setEmail("mani@email.com");
		return person2;
	}
}
