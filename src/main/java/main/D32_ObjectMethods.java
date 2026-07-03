package main;

import java.time.LocalDate;

import model.Person;

public class D32_ObjectMethods {

	public static void main(String[] args) {

		Person person1 = new Person("Peter", 'm', LocalDate.of(2000, 6, 7));
		Person person2 = new Person("Hans", 'm', LocalDate.of(2003, 5, 7));
		Person person3 = new Person("Hans", 'm', LocalDate.of(2003, 5, 7));

		/* To String */
		System.out.println(person1.toString());
		System.out.println(person2.toString());
		System.out.println(person3.toString());
		
		/* equals */
		if (person2 == person3) {
			System.out.println("person2 == person3");
		}

		if (person2.equals(person3)) {
			System.out.println("person2.equals(person3)");
		}
		System.out.println();
		
		/* hashcode */
		System.out.println(person1.hashCode());
		System.out.println(person2.hashCode());
		System.out.println(person3.hashCode());

	}

}
