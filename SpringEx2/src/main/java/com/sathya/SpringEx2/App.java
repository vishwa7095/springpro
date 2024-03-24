package com.sathya.SpringEx2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    //START THE SPRING IOC CONTAINER
    	ApplicationContext context=new ClassPathXmlApplicationContext("SpringEx2-config.xml");
    //GET THE BEAN:
    	  Travellers travallers=context.getBean("travaller",Travellers.class);
    	  	travallers.StartJourney();
        
    }
}
