package main;

import java.time.LocalDate;
import java.util.ArrayList;

import model.Animal;
import model.Color;
import model.Zoo;

public class D24_RecapOOP {
	public static void main(String[] args) {
		
		Zoo zoo = new Zoo("cooler Zoo");
		
		Animal animal1 = new Animal("Pferd",Color.BLACK,false,LocalDate.now(),100);
		Animal animal2 = new Animal("Tiger",Color.ORANGE,true,LocalDate.of(2020, 8, 16),250);
		Animal animal3 = new Animal("Schimpanse",Color.BROWM, true, LocalDate.of(2018, 6, 12), 40);
		
		zoo.addAnimal(animal1);
		zoo.addAnimal(animal2);
		zoo.addAnimal(animal3);
		
		animal3.eat();
		animal2.move();
		animal2.move();
		
		ArrayList<Animal> animals = zoo.getAnimals();
		
		for(Animal animal : animals) {
			System.out.println(animal);
		}
		
//		System.out.println(animal2.getWeightInKg());
//		System.out.println(animal3.getWeightInKg());
//		System.out.println(zoo.getName());
//		System.out.println(zoo.getAnimals());
		
		System.out.println(zoo);
		
	}

}
