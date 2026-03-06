package model;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Person
 */

public class Person {

	private String name;
	private char gender;
	private final LocalDate birthdate;

	public Person(String name, char gender, LocalDate birthdate) {
		this.name = name;
		this.gender = gender;
		this.birthdate = birthdate;
	}
	
	public String getName() {
		return name;
	}
	public char getGender() {
		return gender;
	}
	public LocalDate getBirthdate() {
		return birthdate;
	}

	@Override
	public String toString() {
		return "Person [name= " + name + ", gender=" + gender + ", birthdate=" + birthdate + "]";
	}

	// nicht Klausurrelevant
	@Override
	public boolean equals(Object obj) {
		Person otherPerson = (Person) obj;

		return this.name.equals(otherPerson.name) && gender == otherPerson.gender
				&& birthdate.equals(otherPerson.birthdate);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, gender, birthdate);
	}
	


}
