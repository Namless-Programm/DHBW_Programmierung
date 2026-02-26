package model;

import java.util.ArrayList;

public class Zoo {
	
	private final String name;
	private final ArrayList<Animal> animals;
	
	public Zoo(String name) {
		this.name = name;
		animals = new ArrayList<>();
	}
		
	public String getName() {
		return name;
	}
		
	public void addAnimal(Animal animal) {
		animals.add(animal);
	}
	
	public ArrayList<Animal> getAnimals(){
		return animals;
	}
	public String toString() {
		return "Zoo [name= "+ name + ", " + "Animals= "+ animals + "]";
	}

}
