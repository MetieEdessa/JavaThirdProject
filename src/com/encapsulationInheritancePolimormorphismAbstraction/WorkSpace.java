package com.encapsulationInheritancePolimormorphismAbstraction;

public class WorkSpace {

	public static void main(String[] args) {
		
		EmployeeEncap emp =new EmployeeEncap();
		
		emp.setName("Metie");
		System.out.println(emp.getName());
		emp.setDob("01/01/2021");
		System.out.println(emp.getDob());
		emp.setSsn(9008);
		System.out.println(emp.getSsn());
		
		EmployeeEncap emp2 =new EmployeeEncap();
		
		emp2.setName("Matt");
		System.out.println(emp2.getName());
		emp2.setDob("02/02/2020");
		System.out.println(emp2.getDob());
		emp2.setSsn(978);
		System.out.println(emp2.getSsn());
	}
}
