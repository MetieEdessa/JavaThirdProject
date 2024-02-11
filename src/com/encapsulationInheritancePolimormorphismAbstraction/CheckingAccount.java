package com.encapsulationInheritancePolimormorphismAbstraction;

public class CheckingAccount extends Account {

double interestRate = 1.5;

public double getInterestRate() {
	return interestRate;
}

public void setInterestRate(double interestRate) {
	this.interestRate = interestRate;
}


}
