package com.Sathya.SpringExample4;

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
    	Student student=context.getBean("student",Student.class);
    	student.details();
    	
         
    }
}
