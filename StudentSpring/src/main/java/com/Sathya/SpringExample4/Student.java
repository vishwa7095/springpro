package com.Sathya.SpringExample4;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Student {
	@Autowired
	private  EmailServices emailServices;
	@Autowired
	private  JavaCourseServices javaCourseServices;
	
	 

	public void details()
	{
		emailServices.message();
		javaCourseServices.CourseInfo();
	}


	

}
