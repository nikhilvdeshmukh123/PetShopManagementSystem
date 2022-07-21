package com.bridgelabz.petshop;

import java.util.Objects;

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
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pet other = (Pet) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Pet [id=" + id + ", name=" + name + ", color=" + color + ", price=" + price + "]";
	}
}