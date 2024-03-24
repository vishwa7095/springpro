package com.Sathya.SpringEx4;

public class EmailServices implements MessageServices{

	@Override
	public void message() {
		System.out.println("check email services");
		System.out.println("thois is your email");
	}

}
