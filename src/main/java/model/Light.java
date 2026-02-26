package model;

public class Light {
	
	protected boolean isOn;
	
	public boolean isOn() {
		return isOn;
	}
	public void switchOn() {
		isOn = true;
	}
	public void switchOff() {
		isOn = false;
	}
	
	public boolean isShining() {
		return isOn;
	}
	
	@Override
	public String toString() {
		return "Light [isON= " + isOn + "]";
	}

}
