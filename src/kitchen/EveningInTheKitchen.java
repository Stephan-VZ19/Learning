package kitchen;

import java.util.Scanner;

public class EveningInTheKitchen {

	public static void main(String[] args) {
		
		Person me = new Person("Stephan", true);
		
		Fridge myFridge = new Fridge("SmallFridge");
		
		Food carrot = new Vegetable("Carrot", 108, 0.2, "A", "B", "C", "E");
		
		Food brot = new Vegetable();
		
		myFridge.contains.add(carrot);
		
		System.out.println("There are "+myFridge.contains.size()+" item in the fridge");
	}

}
