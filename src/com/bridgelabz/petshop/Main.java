package com.bridgelabz.petshop;

public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to the PetShop");

		Cat cat1 = new Cat();
		cat1.id = "C001";
		cat1.price = 200;
		Dog dog1 = new Dog();
		dog1.id = "D001";
		dog1.price = 500;
		Duck duck1 = new Duck();
		duck1.id = "DC001";
		duck1.price = 400;
		Mouse mouse1 = new Mouse();
		mouse1.id = "M001";
		mouse1.price = 80;
		Parrot parrot1 = new Parrot();
		parrot1.id = "P001";
		parrot1.price = 350;
		Pigeon pigeon1 = new Pigeon();
		pigeon1.id = "PI001";
		pigeon1.price = 250;

		PetRepository petRepository = new PetRepository();

		petRepository.add(cat1);
		petRepository.add(dog1);
		petRepository.add(duck1);
		petRepository.add(mouse1);
		petRepository.add(parrot1);
		petRepository.add(pigeon1);
		
		UserInterface userInterface = new UserInterface();
		userInterface.printAllPets(petRepository.getPetList());
	
		petRepository.remove(cat1);
		System.out.println("Cat1 is Removed");
		petRepository.remove(pigeon1);
		System.out.println("Pigeon1 is Removed");
		userInterface.printAllPets(petRepository.getPetList());
	}
}