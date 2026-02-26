package main;

import java.util.ArrayList;

import model.FlashLight;
import model.Light;
import model.LightBulb;
import model.TableLight;

public class D31_Inheritance {

	public static void main(String[] args) {
		/* Objekterzeugungen */

		TableLight tableLight1 = new TableLight();

		LightBulb redLightBulb = new LightBulb("rot");
		TableLight tableLight2 = new TableLight(redLightBulb);

		FlashLight flashLight1 = new FlashLight();
		FlashLight flashLight2 = new FlashLight();

		/* Ansatz ohne Vererbung */
		ArrayList<TableLight> tableLights = new ArrayList<>();
		tableLights.add(tableLight1);
		tableLights.add(tableLight2);

		for (TableLight light : tableLights) {
			light.switchOn();
			light.plugIn();
		}

		ArrayList<FlashLight> flashLights = new ArrayList<>();

		flashLights.add(flashLight2);
		flashLights.add(flashLight1);

		for (FlashLight light : flashLights) {
			light.switchOn();
			System.out.println(light.isShining());
		}

		/* Ansatz mit Vererbung */
		ArrayList<Light> lights = new ArrayList<>();
		lights.add(flashLight1); // Upcast
		lights.add(flashLight2); // Upcast
		lights.add(tableLight1); // Upcast
		lights.add(tableLight2); // Upcast

		for (Light light : lights) {
			light.switchOn(); // Dynamischer Polymorphie

			if (light instanceof TableLight) {
				TableLight tableLight = (TableLight) light; // Downcast
				tableLight.plugIn();
			}
			
			if (light instanceof TableLight tableLight) { // Downcast
				tableLight.pullThePlug();
				
			}

			System.out.println(light.isShining()); // Statische Polymorphie (println) + Dynamische Polymorphie
													// (isShining)
			System.out.println(light);// Statische Polymorphie (println) + Dynamische Polymorphie (toString)

		}

	}
}
