package model;

import java.time.LocalDate;

/**
 * Water Animal
 */

public class WaterAnimal extends Animal{
	
	private final boolean isSaltwater;

	public WaterAnimal(String type, Color color, boolean isCarnivore, LocalDate birthdate, double weightInKg,
			boolean isSaltwater) {
		super(type, color, isCarnivore, birthdate, weightInKg);
		
		this.isSaltwater = isSaltwater;
		
	}
	
	public boolean isSaltwater() {
		return isSaltwater;
	}
	
	private void swim() {
		System.out.println("schwim, schwim");
	}
	
	@Override
	public void move() {
		super.move();
		swim();
	}
	
	@Override
	public String toString() {
		return "WaterAnimal [type= " + getType() + ", color= " + getcolor() + ", is Carnivore= "+ isCarnivore() + ", birthdate= "+ getBirthdate() + "weightInKg" + "IsSaltwater=" +isSaltwater+ "]";
	}
	
	
	

}
