package main;

import java.util.Scanner;

/**
 * Loops
 */

public class D15_Loops {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = 1;
		
		/* while-schleife (kopfdesteuerte Schleifen) */
		while(i <= 10) {
			System.out.println(i);
			i++;
		}
		System.out.println(i);
		
		System.out.println();
		
		/* do-while Schleife (fußgesteuerte Schleife) */
		int x = 1;
		
		do {
			System.out.println(x);
			x++;
		} while (x <= 10);
		System.out.println(x);
		System.out.println();
		
		/* for-Schleife (Zählschleife) */
		
		for(int a = 0; a <= 10; a++) {
			System.out.println(a);
		}
//		System.out.println(a);
		
		/* Endlosschleife */
		while (true) {
			System.out.println("Schleife beenden (true oder false)?: ");
			boolean answer = scanner.nextBoolean();
			if(answer == true) {
				break;
			}
			System.out.println("Uhrzeit ausgeben (true oder false)?: ");
			answer = scanner.nextBoolean();
			if (answer == false) {
				continue;
			}
			System.out.println(System.currentTimeMillis());
			
		}
		
		
		
		

	}
	

}
