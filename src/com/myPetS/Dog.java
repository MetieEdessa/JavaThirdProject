package com.myPetS;

public class Dog extends PetStore1 {
	public int size;
	
	
	@Override 
	public String toString() {
		return"["+type+" "+color+" "+price+" "+size+"]"; }
		


	public void dog (int size){
		this.size= 8;
	}
	
	public int getSize(int size) {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
}
