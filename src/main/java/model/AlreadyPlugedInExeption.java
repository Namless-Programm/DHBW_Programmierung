package model;

public class AlreadyPlugedInExeption extends Exception {
	
	public AlreadyPlugedInExeption() {
		super("Device already plugged in");
	}
	
}
