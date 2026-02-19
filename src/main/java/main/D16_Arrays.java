package main;

import java.util.Arrays;
import java.util.Random;

/**
 * Arrays
 */
public class D16_Arrays {

	public static void main(String[] args) {
		Random random = new Random();

		/* Deklaration und Initialisierung */
		int[] numbers = new int[100];
		String[] names = { "hans", "Peter", "Harald" };

		/* Zugriff auf einzelne Feld-Elemente */
		numbers[50] = 3;
		numbers[0] = 7;
		numbers[numbers.length - 1] = 80;
		names[1] = "Hugo";

		System.out.println("numbers[50]: " + numbers[50]);
		System.out.println("numbers[99]: " + numbers[99]);
		System.out.println("numbers[6]: " + numbers[6]);
		System.out.println("names[1]" + names[1]);

		/* Zugrriff auf mehrere Elemente */
		int x = 0;
		while (x < numbers.length) {
			numbers[x] = random.nextInt(1, 10);
			x++;
		}
		for (int i = 0; i < numbers.length; i++) {
			int number = numbers[i];
			System.out.println(i + ":" + number);
		}
		System.out.println(names);
		System.out.println(Arrays.toString(names));

	}

}
