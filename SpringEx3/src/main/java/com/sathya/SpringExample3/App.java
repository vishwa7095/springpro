package com.sathya.SpringExample3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
        
    	Person person1= context.getBean("person1",Person.class);
    	person1.PersonInfo();
    	Person person2=context.getBean("person2",Person.class);
    	person2.PersonInfo();
    }
}
