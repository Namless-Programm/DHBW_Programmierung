package main;

import java.nio.channels.AlreadyBoundException;
import java.util.Scanner;

import model.AlreadyPlugedInExeption;
import model.FlashLight;
import model.Light;
import model.TableLight;

public class D36_Exeptions {

	public static void main(String[] args) {
		// ArrayIndexOutOfBoundsException and NullPointerException
		String[] names = {"hans", "Peter", null};
		try {
			System.out.println(names[3]);
			String name = names[2];
			System.out.println(name.toUpperCase());
			System.out.println(names[1]);
		} catch(ArrayIndexOutOfBoundsException |NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
		//InputMismatchException
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ganze Zahl: ");
		int number = scanner.nextInt();
//		System.out.println(number);
		
		//ClassCastException
		Light light = new TableLight()	; //Upcast
		try {
			light.plugIn();
		} catch (AlreadyPlugedInExeption e) {
			System.out.println(e.getMessage());
		}
		FlashLight flashLight = (FlashLight) light; // Downcast
		

	}

}
