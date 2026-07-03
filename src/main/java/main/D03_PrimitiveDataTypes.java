package main;

import java.math.BigDecimal;

/**
 * Primitive Data Types
 */
public class D03_PrimitiveDataTypes {
	public static void main(String[] args) {
		/* Ganze Zahlen */
		byte byte1 = 67;
		short short1 = 22_743;
		int int1 = 1_000_000_000;
		long long1 = 5_000_000_000L;

		System.out.println("byte1: " + byte1);
		System.out.println("short1: " + short1);
		System.out.println("int1: " + int1);
		System.out.println("long1: " + long1);
		
		/* Zeichen */
		char char1 = 'A';
		char char2 = 0b1000001;
		char char3 = 0101;
		char char4 = 65;
		char char5 = 0x41;
		char char6 = '\u0041';
		
		System.out.println("char1: " + char1);
		System.out.println("char2: " + char2);
		System.out.println("char3: " + char3);
		System.out.println("char4: " + char4);
		System.out.println("char5: " + char5);
		System.out.println("char6: " + char6);
		
		
		/* Boolscher Wahrheitswert */
		boolean boolean1 = true;
		boolean boolean2 = false;
		
		System.out.println("boolean1: " + boolean1);
		System.out.println("boolean2: " + boolean2);
		
		/* Gleitkommazahlen (Floating Point Numbers) */
		float float1 = 0.1F;
		double double1 = 0.1;
		
		System.out.println("Float1: " + float1);
		System.out.println("Double1: " + double1);
		
		BigDecimal bigDecimal1 = new BigDecimal(0.1F);
		BigDecimal bigDecimal2 = new BigDecimal(0.1);
		
		System.out.println("bigdecimal1: " + bigDecimal1);
		System.out.println("bigdecimal2: " + bigDecimal2);
	}

}
