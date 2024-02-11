package com.encapsulationInheritancePolimormorphismAbstraction;

public class AnimalMain {

	public static void main(String[] args) {
		Animal ani =new Animal();
		ani.sound();
		
Cat cat = new Cat();
cat.sound();

Dog dog = new Dog();
dog.sound();

	}

}
