package com.encapsulationInheritancePolimormorphismAbstraction;

public class SavingAccount extends Account {
	double interestRate = 4.5;

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
}
