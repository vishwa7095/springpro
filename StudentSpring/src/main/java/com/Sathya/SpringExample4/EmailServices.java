package com.Sathya.SpringExample4;

import org.springframework.stereotype.Component;

@Component
public class EmailServices implements MessageServices {

	@Override
	public void message() {
		System.out.println("check email services");
		System.out.println("thois is your email");
		
	}
	

}
