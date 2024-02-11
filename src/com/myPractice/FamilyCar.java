package com.myPractice;

public class FamilyCar {

	public static void main(String[] args) {
		
//		create object
		
		OurCar ourcar1 = new OurCar( "Toyota", "white", 2015);{
		ourcar1.model= ("Toyota");
		ourcar1.color = ("white");
		ourcar1.year = 2015;
		
		OurCar ourcar2 = new OurCar( "Toyota", "white", 2015);{
			ourcar1.model= ("Toyota");
			ourcar1.color = ("Blue");
			ourcar1.year = 2015;
			
			OurCar ourcar3 = new OurCar( "Toyota", "red", 2015);{
				ourcar1.model= ("Toyota");
				ourcar1.color = ("Blue");
				ourcar1.year = 2015;
			
		}
		System.out.println(ourcar1.model +","+ourcar1.color +","+ourcar1.year);
		System.out.println(ourcar2.model +","+ourcar2.color +","+ourcar2.year);
		System.out.println(ourcar3.model +","+ourcar3.color +","+ourcar3.year);
	}
		
	}
}
}
