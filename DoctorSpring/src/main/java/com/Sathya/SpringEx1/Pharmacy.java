package com.Sathya.SpringEx1;

public class Pharmacy {
	private String Phramacyname;
	private String Location;
	
	
	
	
	 
//public Pharmacy(String phramacyname, String location) {
//		super();
//		Phramacyname = phramacyname;
//		Location = location;
//	}




//	public String getPhramacyname() {
//		return Phramacyname;
//	}
//
//
//	public void setPhramacyname(String phramacyname) {
//		Phramacyname = phramacyname;
//	}
//
//
//	public String getLocation() {
//		return Location;
//	}
//
//
//	public void setLocation(String location) {
//		Location = location;
//	}
//

	public String getPhramacyname() {
		return Phramacyname;
	}





	public void setPhramacyname(String phramacyname) {
		Phramacyname = phramacyname;
	}





	public String getLocation() {
		return Location;
	}





	public void setLocation(String location) {
		Location = location;
	}





	public void pharInfo()
	{ 
		System.out.println("pharmacy name"+Phramacyname);
		System.out.println("Location name"+Location);
	}

}
