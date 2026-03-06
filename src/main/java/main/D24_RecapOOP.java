package main;

import java.time.LocalDate;
import java.util.ArrayList;

import model.Animal;
import model.Color;
import model.LandAnimal;
import model.WaterAnimal;
import model.Zoo;

public class D24_RecapOOP {
	public static void main(String[] args) {
		
		Zoo zoo = new Zoo("cooler Zoo");
		
		Animal animal1 = new LandAnimal("Pferd",Color.BLACK,false,LocalDate.now(),100, 4); //Upcast
		Animal animal2 = new LandAnimal("Tiger",Color.ORANGE,true,LocalDate.of(2020, 8, 16),250,4); //Upcast
		Animal animal3 = new WaterAnimal("Fisch",Color.ORANGE, false, LocalDate.of(2018, 6, 12), 0.2,true); //Upcast
		
		zoo.addAnimal(animal1);
		zoo.addAnimal(animal2);
		zoo.addAnimal(animal3);
		
		animal3.eat();
		animal2.move();//Dynamische Polymorphie
		animal2.move();//Dynamische Polymorphie
		animal3.move();//Dynamische Polymorphie
		animal2.eat();
		
		ArrayList<Animal> animals = zoo.getAnimals();
		
		for(Animal animal : animals) {
			System.out.println(animal); //Dynamische Polymorphie
		}
		
//		System.out.println(animal2.getWeightInKg());
//		System.out.println(animal3.getWeightInKg());
//		System.out.println(zoo.getName());
//		System.out.println(zoo.getAnimals());
		
		System.out.println(zoo);
		System.out.println();
		
		ArrayList<WaterAnimal> waterAnimals = zoo.getWaterAnimals();
		System.out.println(waterAnimals);
		
	}

}
