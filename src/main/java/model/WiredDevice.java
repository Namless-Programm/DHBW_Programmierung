package model;

/**
 * Wired Device
 */

public interface WiredDevice {
	
	void plugIn() throws AlreadyPlugedInExeption;
	void pullThePlug();

}
