package model;

import java.util.ArrayList;

public class Zoo {
	
	private String name;
	private ArrayList<Animal> animals;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void initializeAnimals() {
		animals = new ArrayList<>();
	}
	
	public void addAnimal(Animal animal) {
		animals.add(animal);
	}
	
	public ArrayList<Animal> getAnimals(){
		return animals;
	}
	

}
