package main;

import java.util.Scanner;

public class D12_StringComparisons {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bitte die Zeichenkette \"true\" eingeben: ");
		String input = scanner.next();
		
		if (input == "true") {
			System.out.println("Gut gemacht");
		} else {
			System.out.println("Leider Falsch");
		}
		
		if(input.equals("true")) {
			System.out.println("Gut gemacht!!");
		}else {
			System.out.println("Leider Falsch!!");
		}

	}

}
