package com.sathya.SpringEx2;

public class Bus implements Vehicle{
	public String bustype;
	public int maxspeed;
	

	


	public String getBustype() {
		return bustype;
	}





	public void setBustype(String bustype) {
		this.bustype = bustype;
	}





	public int getMaxspeed() {
		return maxspeed;
	}





	public void setMaxspeed(int maxspeed) {
		this.maxspeed = maxspeed;
	}





	@Override
	public void move() {
		System.out.println("Your Selected Bus Vehicle");
		System.out.println("max speed"+maxspeed);
		System.out.println("bus type"+bustype);		
		
	}

}
