package com.encapsulationInheritancePolimormorphismAbstraction;

public class Bank {

	public static void main(String[] args) {
		//object create
CheckingAccount ca = new CheckingAccount();	
SavingAccount sa = new SavingAccount();
Account a = new Account();
TotalCheckingAccount ta = new TotalCheckingAccount();

//set an inherited method
ca.setAccHolderName("Metie");
System.out.println(ca.getAccHolderName());

	}
}
