package com.bridgelabz.petshop;

import com.bridgelabz.petshop.Pet.Color;

public class Parrot extends Pet implements Flyable{

	public Parrot() {
		name = "Parrot";
		color = Color.GREEN;
	}
	
	@Override
	public void fly () {
		System.out.println("Parrot fly");
	}
}
