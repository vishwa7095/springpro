package com.Sathya.SpringEx4;

public class Student {
	private EmailServices emailServices;
	private JavaCourseService javacourServices;
	public EmailServices getEmailServices() {
		return emailServices;
	}
	public void setEmailServices(EmailServices emailServices) {
		this.emailServices = emailServices;
	}
	public JavaCourseService getJavacourServices() {
		return javacourServices;
	}
	public void setJavacourServices(JavaCourseService javacourServices) {
		this.javacourServices = javacourServices;
	}
	public void Details()
	{
		emailServices.message();
		javacourServices.courseInfo();
		
	}
	

}
