package com.sathya.SpringEx2;

public class Car implements Vehicle{
	private String fueltype;
	private int maxspeed;
	

	public String getFueltype() {
		return fueltype;
	}


	public void setFueltype(String fueltype) {
		this.fueltype = fueltype;
	}


	public int getMaxspeed() {
		return maxspeed;
	}


	public void setMaxspeed(int maxspeed) {
		this.maxspeed = maxspeed;
	}


	@Override
	public void move() {
		 System.out.println("YOUR Selected car Vehicle");
		 System.out.println("max speed..."+maxspeed);
		 System.out.println("fueltype.."+fueltype);
		
		
	}

}
