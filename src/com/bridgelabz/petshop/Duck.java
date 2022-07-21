package com.bridgelabz.petshop;

public class Duck extends Pet implements Swimable, Flyable {

	public Duck() {
		name = "Duck";
		color = Color.WHITE;
	}

	@Override
	public void swim() {
		System.out.println("Duck swims");
	}

	@Override
	public void fly() {
		System.out.println("Cat fly");
	}
}