package com.bridgelabz.petshop;

import java.util.ArrayList;
import java.util.List;

public class PetRepository {
	private List petList = new ArrayList();
	
	public List getPetList() {
		return petList;
	}
	public void add(Pet pet) {
		petList.add(pet);
	}
	public void remove(Pet pet) {
		petList.remove(pet);
	}
}