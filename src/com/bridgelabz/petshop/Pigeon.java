package com.bridgelabz.petshop;

public class Pigeon extends Pet implements Flyable{

	public Pigeon() {
		name = "Pigeon";
		color = Color.GREY;
	}
	@Override
	public void fly () {
		System.out.println("Pigeon fly");
	}
}