package main;

import java.util.ArrayList;

import model.FlashLight;
import model.Light;
import model.TableLight;
import model.Toaster;
import model.WiredDevice;

/**
 * Interfaces
 */

public class D33_Interfaces {

	public static void main(String[] args) {
		
		TableLight light1 = new TableLight();
		TableLight light2 = new TableLight();
		Light flashLight = new FlashLight();
		Toaster toaster1 = new Toaster();
		Toaster toaster2 = new Toaster();
		
		ArrayList<WiredDevice> wiredDevices = new ArrayList<>();
		
		wiredDevices.add(toaster1); // Upcast
		wiredDevices.add(light1);// Upcast
		wiredDevices.add(toaster2);// Upcast
		wiredDevices.add(light2);// Upcast
		
		for (WiredDevice wiredDevice : wiredDevices) {
			wiredDevice.plugIn(); // Dynamische Polymorphie
			if (wiredDevice instanceof TableLight) {
				TableLight tableLight = (TableLight) wiredDevice; //Downcast
				tableLight.switchOn();
				System.out.println(tableLight);
			}
			
		}
		
		System.out.println(wiredDevices);
		
		

	}

}
