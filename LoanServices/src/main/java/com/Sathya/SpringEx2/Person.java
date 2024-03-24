package com.Sathya.SpringEx2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Person {
	@Autowired
	private HomeLoanServices homeLoanServices;
	@Autowired
	private RealstateServices realstateServices;

	 
	
	public void details()
	{
		homeLoanServices.LoanInfo();
		realstateServices.Realstate();
	}

} 
