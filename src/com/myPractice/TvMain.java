package com.myPractice;

public class TvMain {

	public static void main(String[] args) {

//create object
		
		Tv samsung=new Tv();{
			samsung.name = "Samsung";
			samsung.model = "sx";
			samsung.price = 1600.00;
			samsung.made= "Japan";
			
		Tv sony=new Tv();
			sony.name= "Sony";
			sony.model = "ml";
			sony.price =1800.00;
			sony.made= "Germany";
			
			Tv philips=new Tv();
			philips.name="Philips";
			philips.model="126md";
			philips.price=2000.00;
			philips.made="usa";
		
		
System.out.println(samsung.name + ","+samsung.model+"," + samsung.price +","+ samsung.made);
System.out.println(sony.name + ","+sony.model+"," + sony.price +","+ sony.made);
System.out.println(philips.name+ ","+philips.model+"," + philips.price +","+ philips.made);
		}
	}
}

