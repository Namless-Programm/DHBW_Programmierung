package main;

import model.LightBulb;
import model.TableLight;

public class D27_StaticElements {

	public static void main(String[] args) {
		
		int numberOfTableLights = TableLight.getNumberOfTableLights();
		System.out.println(numberOfTableLights);
		
		TableLight light1 = new TableLight();
		TableLight light2 = new TableLight();
		TableLight light3 = new TableLight();
		LightBulb redLightBulb = new LightBulb("red");
		
		light1.switchOn();
		light1.plugIn();
		light1.changeLightBulb(redLightBulb);
		light2.switchOn();
		light3.plugIn();
		
		numberOfTableLights = TableLight.getNumberOfTableLights();
		System.out.println(numberOfTableLights);
		System.out.println(light1.isOn());
		

	}

}
