package Excercise;

import java.util.Random;
import java.util.Scanner;

/**
 * ConsoleApplications03
 */

public class SE01_WarhammerGame {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		/* Deklarationen */

		int healthPointsOfFighter1;
		int healthPointsOfFighter2;
		String nameOfPlayer1;
		String nameOfPlayer2;
		String nameOfFighter1;
		String nameOfFighter2;
		boolean quitGame;

		/* Spielablauf */
		System.out.print("Player 1, Name: ");
		nameOfPlayer1 = scanner.next();
		System.out.println();
		
		System.out.print("Player 2, Name: ");
		nameOfPlayer2 = scanner.next();
		System.out.println();

		while (true) {
			System.out.print("Do you want to play another round? (yes or no): ");
			String answer = scanner.next();
			if (answer.equals("yes") || answer.equals("Yes")) {
				quitGame = false;
			} else {
				quitGame = true;
			}
			if (quitGame) {
				break;
			}
			/* Initializing Players */

			System.out.print("Playr 1, Fighter 1: ");
			nameOfFighter1 = scanner.next();
			System.out.println();

			System.out.print("Player 1, Fighter 1, LP: ");
			healthPointsOfFighter1 = scanner.nextInt();
			System.out.println();

			System.out.print("Player 2, Fighter 2: ");
			nameOfFighter2 = scanner.next();
			System.out.println();

			System.out.print("Player 2, Fighter 2, LP: ");
			healthPointsOfFighter2 = scanner.nextInt();
			System.out.println();

			int turn = 1;
			while (healthPointsOfFighter2 > 0 && healthPointsOfFighter1 > 0) {
				System.out.println("*-------------*");
				System.out.println("*---" + "Trun: " + turn + "---*");
				System.out.println("*-------------*");

				healthPointsOfFighter2 = valueOfDamage(healthPointsOfFighter2, nameOfPlayer1, nameOfPlayer2);
				healthOutputOfPlayer(healthPointsOfFighter2, nameOfFighter2);
				if (healthPointsOfFighter2 <= 0) {
					break;
				}

				healthPointsOfFighter1 = valueOfDamage(healthPointsOfFighter1, nameOfPlayer2, nameOfPlayer1);
				healthOutputOfPlayer(healthPointsOfFighter1, nameOfFighter1);

				turn++;

			}
		}

	}

	public static int valueOfDamage(int healthPointsOfFighter, String attacingPlayer, String defendingPlayer) {
		Random random = new Random();

		int[] valueOfDice = new int[7];
		int totalHits = 0;
		int totalBlocks = 0;

		for (int i = 0; i <= valueOfDice.length - 1; i++) {
			valueOfDice[i] = random.nextInt(1, 7);
		}

		for (int i = 0; i <= 3; i++) {
			System.out.println("Player " + attacingPlayer + " rollt: " + valueOfDice[i]);
			totalHits += valueOfDice[i];
		}
		System.out.println("TotalHits: " + totalHits);
		System.out.println();

		for (int i = 4; i <= valueOfDice.length - 1; i++) {
			System.out.println("Player " + defendingPlayer + " rollt: " + valueOfDice[i]);
			totalBlocks += valueOfDice[i];
		}
		System.out.println("TotalBlocks: " + totalBlocks);
		System.out.println();

		if (totalBlocks >= totalHits) {
			System.out.println("No damage was dealt");
			System.out.println("Total Hits: " + totalHits);
			System.out.println("Total Blocks: " + totalBlocks);
			System.out.println();
		} else {
			int totalDamage = totalHits - totalBlocks;
			System.out.println("Total Damage: " + totalDamage);
			System.out.println();
			healthPointsOfFighter -= totalDamage;
		}
		return healthPointsOfFighter;
	}

	public static void healthOutputOfPlayer(int healthPointsOfFighter, String defendingFighter) {
		if (healthPointsOfFighter <= 0) {
			System.out.println("Fighter " + defendingFighter + " is dead.");
//			System.exit(0);
		} else {
			System.out.println("Fighter " + defendingFighter + " has " + healthPointsOfFighter + " LP left.");
			System.out.println();
		}

	}

}
