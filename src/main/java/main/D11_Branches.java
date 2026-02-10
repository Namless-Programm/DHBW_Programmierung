package main;

import java.util.Scanner;

public class D11_Branches {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bitte alter eingeben: ");
		int age = scanner.nextInt();
		
		/* Einfachverzweigung */
		if(age < 18) {
			System.out.println("Du bist minderjährig");
		} else {
			System.out.println("Du bist volljährig");
		}
		
		/* Mehrfachverzweigung */
		if(age < 12) {
			System.out.println("Du bist ein Kind");
		} else if (age < 18) {
			System.out.println("Du bist ein Jugendlicher");
		} else if (age < 65){
			System.out.println("Du bist ein Erwachsener");
		} else {
			System.out.println("Du bist ein Senior");
		}
		
		/* Vergleichs operatoren: >, >=, <, <=, ==, != */
		/* Logische Operatoren: && (logisches und), || (logiscche oder), ! (logische Verneinung) */

	}

}
