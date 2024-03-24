package com.sathya.SpringEx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("spring_config.xml");
        System.out.println( "bharath is my coreheart" );
     GreetingImpl greetingImpl=context.getBean("greet",GreetingImpl.class);
     greetingImpl.greet();
    }
}
