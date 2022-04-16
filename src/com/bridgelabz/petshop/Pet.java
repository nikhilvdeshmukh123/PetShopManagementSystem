package com.bridgelabz.petshop;

public class Pet {
	enum Color {
		BROWN, RED, BLACK, WHITE, GREEN, BLACK_WHITE, GREY
	}

	String id;
	String name;
	Color color;
	int price;

	public void eat() {
		System.out.println(getClass().getSimpleName() + " eats.");
	}

	@Override
	public String toString() {
		return "Pet [id=" + id + ", name=" + name + ", color=" + color + ", price=" + price + "]";
	}
	
}
