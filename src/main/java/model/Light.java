package model;

public abstract class Light {
	
	protected boolean isOn;
	
	public boolean isOn() {
		return isOn;
	}
	public void switchOn() {
		isOn = true;
	}
	public final void switchOff() {
		isOn = false;
	}
	
	public abstract boolean isShining();
	
	@Override
	public String toString() {
		return "Light [isON= " + isOn + "]";
	}

}
