package com.bridgelabz.petshop;

import java.util.List;

public class UserInterface {
	public void printAllPets(List list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}