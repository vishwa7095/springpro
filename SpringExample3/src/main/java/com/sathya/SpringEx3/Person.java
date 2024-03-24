package com.sathya.SpringEx3;

 
 
public class Person implements Greeting{
	private String name;
	private String email;
	

	public String getName() {
		return name;
	}

	 
	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}

	 
	public void setEmail(String email) {
		this.email = email;
	}

 
		public void PersonInfo()
		{
			System.out.println("hey"+name+"welcome to spring");
			System.out.println("this is your"+email+name);
		}
		
	
	

}
