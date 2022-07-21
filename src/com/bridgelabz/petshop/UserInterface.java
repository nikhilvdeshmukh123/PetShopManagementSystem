package com.bridgelabz.petshop;

import java.util.Scanner;
import java.util.Set;

import com.bridgelabz.petshop.Pet.Color;

public class UserInterface {
	public void printAllPets(Set<Pet> set) {
		for (Pet pet : set) {
			System.out.println(pet);
		}
	}

	private static UserInterface userInterfaceInstance;

	private UserInterface() {

	}

	public static UserInterface getInstance() {
		if (userInterfaceInstance == null) {
			userInterfaceInstance = new UserInterface();
		}
		return userInterfaceInstance;
	}

	public void addPet() {
		PetRepository petRepository = PetRepository.getInstance();
		Scanner scanner = new Scanner(System.in);
		Pet pet = new Pet();
		System.out.println("Enter pet Name :");
		pet.name = scanner.next();

		System.out.println("Enter Pet ID :");
		pet.id = scanner.next();

		System.out.println("Enter Pet Price :");
		pet.price = scanner.nextInt();
		setColor(pet);
		petRepository.add(pet);

	}

	public void setColor(Pet pet) {
		System.out.println("Choose color you want 1:BROWN 2:RED 3:BLACK 4:WHITE 5:GREEN 6:BLACK_WHITE 7:GREY ");
		Scanner input = new Scanner(System.in);
		int color = input.nextInt();
		switch (color) {
		case 1:
			pet.color = Color.BROWN;
			break;
		case 2:
			pet.color = Color.RED;
			break;
		case 3:
			pet.color = Color.BLACK;
			break;
		case 4:
			pet.color = Color.WHITE;
			break;
		case 5:
			pet.color = Color.GREEN;
			break;
		case 6:
			pet.color = Color.BLACK_WHITE;
			break;
		case 7:
			pet.color = Color.GREY;
			break;
		}
	}

	public int showMainMenu() {
		System.out.println("Select The Option: \n 1:Add Pets \n 2:Print Pet \n 3:Remove Pet \n 4:Update Pet \n 5:Exit");
		Scanner scanner = new Scanner(System.in);
		int Choice = scanner.nextInt();
		return Choice;
	}

	public void updatePet() {
		PetRepository petRepository = PetRepository.getInstance();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name of pet you want to update");
		String id = scanner.next();
		Pet pet = petRepository.getPet(id);
		System.out.println("Enter option to update : ");
		System.out.println("1.pet name \n2.pet price \n3:pet color");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter name of Pet");
			pet.name = scanner.next();
			break;
		case 2:
			System.out.println("Enter price of Pet");
			pet.price = scanner.nextInt();
			break;
		case 3:
			System.out.println("Enter color of Pet");
			userInterfaceInstance.setColor(pet);
			break;
		default:
			System.out.println("Exit");
		}
	}

	public void removePet() {
		PetRepository petRepository = PetRepository.getInstance();
		System.out.println("Enter The Pet Name You Want To Remove");
		Scanner scanner = new Scanner(System.in);
		String id = scanner.next();
		Pet pet = petRepository.getPet(id);
		petRepository.remove(pet);
	}

	private void printPet(Set<Pet> petList) {
		PetRepository petRepository = PetRepository.getInstance();
		UserInterface userInterface = new UserInterface();
		userInterface.printAllPets(petRepository.getPetList());
	}
}