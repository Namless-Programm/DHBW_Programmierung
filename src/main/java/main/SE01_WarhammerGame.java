package main;

import java.util.Random;
import java.util.Scanner;

/**
 * ConsoleApplications03
 */

public class SE01_WarhammerGame {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		/* Deklarationen */

		int healthPointsOfFighter1;
		int healthPointsOfFighter2;
		String nameOfPlayer1;
		String nameOfPlayer2;
		String nameOfFighter1;
		String nameOfFighter2;
		boolean quitGame;

		/* Spielablauf */

		while (true) {
			System.out.print("Do you want to play another round?: ");
			String answer = scanner.next();
			if (answer.equals("yes")) {
				quitGame = false;
			} else {
				quitGame = true;
			}
			if (quitGame) {
				break;
			}
			/* Initializing Players */
			System.out.print("Player 1, Name: ");
			nameOfPlayer1 = scanner.next();
			System.out.println();

			System.out.print("Playr 1, Fighter 1: ");
			nameOfFighter1 = scanner.next();
			System.out.println();

			System.out.print("Player 1, Fighter 1, LP: ");
			healthPointsOfFighter1 = scanner.nextInt();
			System.out.println();

			System.out.print("Player 2, Name: ");
			nameOfPlayer2 = scanner.next();
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

	public static int diceRoll() {
		Random random = new Random();
		int valueOfDice;
		valueOfDice = random.nextInt(1, 7);
		return valueOfDice;

	}

	public static int attackValue(String attacingPlayer) {
		int totalHits = 0;
		int valueOfDice;

		for (int i = 0; i <= 4; i++) {
			valueOfDice = diceRoll();
			System.out.println("Player " + attacingPlayer + " rollt: " + valueOfDice);
			totalHits += valueOfDice;
		}

		return totalHits;
	}

	public static int defendingValue(String defendingPlayer) {
		int totalBlocks = 0;
		int valueOfDice;

		for (int i = 0; i <= 2; i++) {
			valueOfDice = diceRoll();
			System.out.println("Player " + defendingPlayer + " rollt: " + valueOfDice);
			totalBlocks += valueOfDice;
		}
		return totalBlocks;
	}

	public static int valueOfDamage(int healthPointsOfFighter, String attacingPlayer, String defendingPlayer) {

		int totalHits = attackValue(attacingPlayer);
		System.out.println("TotalHits: " + totalHits);
		System.out.println();

		int totalBlocks = defendingValue(defendingPlayer);
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
