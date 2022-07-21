package com.bridgelabz.petshop;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import java.util.HashSet;
import java.util.Set;

public class PetRepository {
    //private List<Pet> petList = new ArrayList();
    private Set<Pet> petList = new HashSet<>();

    private static PetRepository PetRepositoryInstance;

    private PetRepository() {
    	
    }

    public static synchronized PetRepository getInstance() {
        if(PetRepositoryInstance == null) {
            PetRepositoryInstance = new PetRepository();
        }
        return PetRepositoryInstance;
    }

    public Set<Pet> getPetList() {
        return petList;
    }

    public void add(Pet pet) {
        petList.add(pet);
    }

    public void remove(Pet pet) {
        petList.remove(pet);
    }

    public Pet getPet(String id) {
//        for(Pet pet : petList) {
//            if(pet.name.equals(name))
//                return pet;
//        }
    	return petList.stream().filter(pet -> pet.id.equals(id)).findFirst().orElse(null);
    }
}

