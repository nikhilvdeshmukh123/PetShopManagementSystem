package com.bridgelabz.petshop;

public class Dog extends Pet implements Swimable {

	public Dog() {
		name = "Dog";
		color = Color.BROWN;
	}

	@Override
	public void swim() {
		System.out.println("Dog swims");
	}
}