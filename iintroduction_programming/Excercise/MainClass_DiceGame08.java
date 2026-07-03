package Excercise;

import java.util.Scanner;

public class MainClass_DiceGame08 {

	private static Player_DiceGame08 player1;
	private static Player_DiceGame08 player2;
	private static int rounds;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Bitte den Namen von Spieler 1 eingeben: ");
		player1 = new Player_DiceGame08(scanner.nextLine());
		System.out.println("Bitte den Namen von Spieler 2 eingeben: ");
		player2 = new Player_DiceGame08(scanner.nextLine());

		String player1Name = player1.getName();
		String player2Name = player2.getName();

		int pointsPlayer1 = player1.getPoints();
		int pointsPlayer2 = player2.getPoints();
		rounds = 0;

		while (pointsPlayer1 < 50 && pointsPlayer2 < 50) {
			rounds++;
			System.out.println("Runde: " + rounds);
			int valuePlayer1 = player1.rollTheDice();
			int valuePlayer2 = player2.rollTheDice();
			player1.setPoints(valuePlayer1);
			player2.setPoints(valuePlayer2);

			System.out.println(player1Name + ": " + valuePlayer1);
			System.out.println(player2Name + ": " + valuePlayer2);
			 pointsPlayer1 = player1.getPoints();
			 pointsPlayer2 = player2.getPoints();
			
		}

		System.out.println("Punktzahl " + player1Name + ": " + pointsPlayer1);
		System.out.println("Punktzahl " + player2Name + ": " + pointsPlayer2);

	}

}
