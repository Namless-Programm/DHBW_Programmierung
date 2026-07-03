package main;

import java.util.Random;
import java.util.Scanner;

public class E_L05_A07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int numberToGuess;

		do {
			System.out.print("Do you want to play antoher round? (yes or no): ");
			String answer = scanner.next();
			if (answer.equals("no") || answer.equals("No")) {
				break;
			}

			numberToGuess = random.nextInt(1, 100);

			System.out.println("Rate die Zahl zwischen 1 und 100!");
			while (true) {
				System.out.println("Bitte gebe Deinen Tipp ein: ");
				int guess = scanner.nextInt();
				System.out.println();

				if (guess == numberToGuess) {
					System.out.println("Richtig geraten die Zahl wahr: " + numberToGuess);
					break;
				} else if (guess < numberToGuess) {
					System.out.println("Leider falsch, die gesuchte Zahl ist größer!");
				} else {
					System.out.println("Leider falsch, die gesuchte Zahl ist kleiner!");
				}
				System.out.print("Möchtest du noch einmal Raten? (yes or no): ");
				String answer2 = scanner.next();
				if (answer2.equals("yes") || answer2.equals("Yes")) {
					continue;
				} else {
					System.out.println("Schade, die Zahl wahr die: " + numberToGuess);
					break;
				}

			}

		} while (true);

		int[] arrayOne = { 1, 2, 3, 4 };
		int[] arrayTwo = { 5, 6, 7, 8 };
		int[] arrayThree = new int[arrayOne.length + arrayTwo.length];

		for (int i = 0; i < ((arrayOne.length) + (arrayTwo.length)); i++) {
			if (i < arrayOne.length) {
				arrayThree[i] = arrayOne[i];
			} else {
				arrayThree[i] = arrayTwo[i - arrayOne.length];
			}

		}
		for (int i = 0; i < arrayThree.length; i++) {
			System.out.println(arrayThree[i]);
		}

	}

}
