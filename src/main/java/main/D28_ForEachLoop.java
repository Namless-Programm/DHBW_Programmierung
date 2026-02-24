package main;

import java.util.ArrayList;

public class D28_ForEachLoop {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<>();

		names.add("Hans");
		names.add("Peter");
		names.add("Karl");
		names.add("Lisa");

		/* klassiche for Schliefe */
		for (int i = 0; i < names.size(); i++) {
//			String name = names.get(i);
			System.out.println(names.get(i));
//			System.out.println(name);
		}
		System.out.println();

		/* For each Schleife */
		for (String name : names) {
			System.out.println(name);
		}

	}

}
