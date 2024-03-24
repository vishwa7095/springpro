package com.Sathya.SpringExample4;

import org.springframework.stereotype.Component;

@Component
public class JavaCourseServices implements CourseServices {

	@Override
	public void CourseInfo() {
		System.out.println("java full stack course");
		
	}

}
