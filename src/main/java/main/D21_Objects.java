package main;

import model.LightBulb;
import model.TableLight;

/**
 * Objects
 */
public class D21_Objects {

	public static void main(String[] args) {
		
		int i = 0;
		TableLight light1 = null;
		i = 5;
		light1 = new TableLight();
		LightBulb redLightBulb = new LightBulb();
		redLightBulb.color = "red";
		light1.changeLightBulb(redLightBulb);
		
		int x = i;
		TableLight light2 = light1;
		
		i = 7;
		light2.plugIn();
		light1.switchOn();
		
		System.out.println("i: " + i);
		System.out.println("x: " + x);
		System.out.println("light1: " + light1);
		System.out.println("light2: " + light2);
		System.out.println("l1 equals l2: " + light1.equals(light2));
		System.out.println("Is Shining: " + light2.isShining());

	}

}
