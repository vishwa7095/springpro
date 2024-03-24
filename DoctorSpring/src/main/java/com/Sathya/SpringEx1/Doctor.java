package com.Sathya.SpringEx1;

public class Doctor {
	private int id;
	private String name;
	
	


//public Doctor(int id, String name) {
//		super();
//		this.id = id;
//		this.name = name;
//	}



public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




public void doctorInfo() {
	System.out.println("DoctorId:"+id);
	System.out.println("DoctorName:"+name);

}
	
	

}
