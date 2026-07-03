package Excercise;

import java.util.Random;

public class Dice_DiceGame08{
private int value;
	
	public Dice_DiceGame08(){
		rollTheDice();
	}
	
	public void rollTheDice(){
		Random random = new Random();
		value = random.nextInt(1, 7);
	}
	
	public void setValue(int value){
		this.value = value;
	}
	
	public int getValue(){
		return value;
	}
}
