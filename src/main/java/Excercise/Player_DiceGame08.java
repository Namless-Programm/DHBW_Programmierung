package Excercise;

public class Player_DiceGame08 {
	private final String name;
	private int points;
	private final Dice_DiceGame08 dice;
	
	public Player_DiceGame08(String name){
		this.name = name;
		dice = new Dice_DiceGame08();
	}
	
	public int rollTheDice(){
		dice.rollTheDice();
		int diceValue = dice.getValue();
		return diceValue;
	}
	
	public void setPoints(int points){
		this.points += points;
	}
	
	public int getPoints(){
		return points;
	}
	
	public Dice_DiceGame08 getDice(){
		return dice;
	}
	
	public String getName(){
		return name;
	}
}
