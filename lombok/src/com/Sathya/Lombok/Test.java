package com.Sathya.Lombok;

public class Test {

	public static void main(String[] args) {
		Employee employee =new Employee();
		employee.setEmpId(101);
		employee.setEmpName("vinodh");
		employee.setEmpSalary(20000.5);
		System.out.println(employee.getEmpId()+" "+employee.getEmpName()+" "+employee.getEmpSalary());

	}

}
