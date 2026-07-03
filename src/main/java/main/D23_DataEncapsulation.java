package main;

import model.LightBulb;
import model.TableLight;

/**
 * Data Encapsulation
 */
public class D23_DataEncapsulation {

	public static void main(String[] args) {
		
		LightBulb redLightBulb = new LightBulb();
		redLightBulb.setColor("red");
		
		TableLight light1 = new TableLight();
		light1.switchOn();
		light1.plugIn();
		light1.changeLightBulb(redLightBulb);
		
		System.out.println(light1.isShining());
		System.out.println(light1.getLightBulb().getColor());

	}

}
