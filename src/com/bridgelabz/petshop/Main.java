package com.bridgelabz.petshop;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the PetShop");

        Main main = new Main();
        UserInterface userInterface = UserInterface.getInstance();
        int Choice = 0;
        while(Choice != 5) {
            int input = userInterface.showMainMenu();
            main.handleUserSelection(input);

        }


//		Cat cat = new Cat();
//		cat.id = "C001";
//		cat.price = 200;
//		Dog dog = new Dog();
//		dog.id = "D001";
//		dog.price = 500;
//		Duck duck = new Duck();
//		duck.id = "DC001";
//		duck.price = 400;
//		Mouse mouse= new Mouse();
//		mouse.id = "M001";
//		mouse.price = 80;
//		Parrot parrot = new Parrot();
//		parrot.id = "P001";
//		parrot.price = 350;
//		Pigeon pigeon = new Pigeon();
//		pigeon.id = "PI001";
//		pigeon.price = 250;
//
//		PetRepository petRepository = new PetRepository();
//
//		petRepository.add(cat);
//		petRepository.add(dog);
//		petRepository.add(duck);
//		petRepository.add(mouse);
//		petRepository.add(parrot);
//		petRepository.add(pigeon);
//
//		UserInterface userInterface = new UserInterface();
//		userInterface.printAllPets(petRepository.getPetList());
//
//		petRepository.remove(cat);
//		System.out.println("Cat is Removed");
//		petRepository.remove(pigeon);
//		System.out.println("Pigeon is Removed");
//		userInterface.printAllPets(petRepository.getPetList());
    }

    public void handleUserSelection(int Choice) {
        PetRepository petRepository = PetRepository.getInstance();
        UserInterface userInterface = UserInterface.getInstance();
        switch (Choice) {
            case 1:
                userInterface.addPet();
                System.out.println("Pet added successfully");
                break;
            case 2:
                userInterface.printAllPets(petRepository.getPetList());
                break;
            case 3:
                userInterface.removePet();
                System.out.println("Pet removed successfully");
                break;
            case 4:
                userInterface.updatePet();
                System.out.println("Update successfully");
                break;
            case 5:
                System.out.println(" Exit");
                break;
            default :
                System.out.println("Enter Valid Option");

        }
    }
}
