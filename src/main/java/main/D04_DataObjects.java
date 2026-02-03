package main;

/**
 * Data Objects
 */

public class D04_DataObjects {

	/* Konstanten */
	public final static double PI = 3.14159265359;

	public static void main(String[] args) {
		/* Deklaration */
		int age;
		String name, firstName, familyName, firstNameAndFamiliyName;
		double sizeInM;
		boolean isMale;

		/* Initialisierung */
		age = 18;
		firstName = "Jonnes";
		sizeInM = 180;
		isMale = true;

		System.out.println("age: " + age);
		System.out.println("firstName: " + firstName);
		System.out.println("sizeInM: " + sizeInM);
		System.out.println("isMale: " + isMale);
		
		System.out.println("PI: " + D04_DataObjects.PI);

		/* Veränderliche Datenobjekte */
		age = 20;
		System.out.println("age: " + age);

		/* Unveränderliche Datenobjekte */
		final String text = "Java";
//		text = "Phyton";

	}

}
