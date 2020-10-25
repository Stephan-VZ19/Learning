package kitchen;

import java.util.Scanner;

public class EveningInTheKitchen {

	public static void main(String[] args) {
		
		Person me = new Person("Stephan", true);
		
		Fridge myFridge = new Fridge("MyFridge");
		
		Food carrot = new Vegetable("Carrot", 108, 0.2, "A", "B", "C", "E");
		
		Food bottleOfWater = new Food("Bottle of Water");
		
		myFridge.contains.add(carrot);
		myFridge.contains.add(bottleOfWater);
		
		System.out.println("There are "+myFridge.contains.size()+" items in the fridge");

		bottleOfWater.getFoodInfos();
		carrot.getFoodInfos();
	}

}
