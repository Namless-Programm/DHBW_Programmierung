package model;

/**
 * Table Light
 */

public class TableLight {
	private boolean isConnected;
	private boolean isOn;
	private LightBulb lightBulb;

	public void plugIn() {
		this.isConnected = true;
	}

	public void pullThePlug() {
		this.isConnected = false;
	}

	public void switchOn() {
		this.isOn = true;
	}

	public void switchOff() {
		this.isOn = false;
	}

	public LightBulb changeLightBulb(LightBulb newLightbulb) {
		LightBulb oldLightBulb = lightBulb;
		lightBulb = newLightbulb;

		return oldLightBulb;
	}
	
	public boolean isShining() {
		if(isConnected == true && isOn == true && lightBulb != null) {
			return true;
		}
		else {
			return false;
		}
//		return isConnected && isOn && lightBulb != null;
	}
	
	public boolean isConnected() {
		return isConnected;
	}
	public boolean isOn() {
		return isOn;
	}
	public LightBulb getLightBulb() {
		return lightBulb;
	}

}
