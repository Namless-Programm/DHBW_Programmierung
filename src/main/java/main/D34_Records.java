package main;
import model.DragenClass;
import model.DragonType;
public class D34_Records {
	//Approach with normal class
	DragenClass dragon1 = new DragenClass("Fafnir", DragonType.FIRE, 500);
	DragenClass dragon2 = new DragenClass("Fafnir", DragonType.FIRE, 500);
	
	//Aproach with Record
	DragonRecord dragon3 = new DragonRecord("Fafnir", DragonType.FIRE, 500);
	DragonRecord dragon4 = new DragonRecord("Fafnir", DragonType.FIRE, 500);
	
}
