package com.bridgelabz.petshop;

public class Cat extends Pet implements Swimable {

	public Cat() {
		name = "Cat";
		color = Color.BLACK_WHITE;
	}

	@Override
	public void swim() {
		System.out.println("Cat swims");
	}
}