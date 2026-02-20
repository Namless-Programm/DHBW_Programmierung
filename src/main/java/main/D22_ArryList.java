package main;

import java.util.ArrayList;

/**
 * Array List
 */

public class D22_ArryList {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();
		
		/* Elemente anfügen */
		names.add("Hans");
		names.add("Peter");
		
		/* Elemente Einfügen */
		names.add(1, "Lisa");
		names.add(1, "Max");
		names.add(2, "Anna");
		
		/* Löschen */
		names.remove(0);
		names.remove("Anna");
		
		/*Elemente auslesen*/
		for(int i = 0; i < names.size(); i++) {
			String name = names.get(i);
			System.out.println(name);
		}
		
		/* Elemente ausgeben */
		System.out.println(names);

	}

}
