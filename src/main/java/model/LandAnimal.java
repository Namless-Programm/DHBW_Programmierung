package model;

import java.time.LocalDate;

public class LandAnimal extends Animal{
	
	private final int numberOfLegs;

	public LandAnimal(String type, Color color, boolean isCarnivore, LocalDate birthdate, double weightInKg, int numberOfLegs) {
		super(type, color, isCarnivore, birthdate, weightInKg);
		this.numberOfLegs = numberOfLegs;
		
	}
	
	public void run() {
		System.out.println("run, run");
	}
	
	@Override
	public void move() {
		super.move();
		run();
	}
	
	
	@Override
	public String toString() {
		return "LandAnimal= [type= " + getType() + ", color= " + getcolor() + ", is Carnivore= " + isCarnivore() + ", birthdate= "+ getBirthdate() + "weightInKg" +"numberOfLegs="+numberOfLegs+ "]";
	}

}
