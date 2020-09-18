package kitchen;

import java.util.Scanner;

public class EveningInTheKitchen {

	public static void main(String[] args) {
		
		Person me = new Person("Stephan", true);
		
		Fridge myFridge = new Fridge("SmallFridge");
		
//		System.out.println("Which nutrition do you want to put in the "+ myFridge.getName()+"?");
//		
//		Scanner input = new Scanner(System.in);
//		
//		String foodName = input.next();
		
//		Kitchenobject ding = new Kitchenobject("fjlsls") {
//			public String testMeth( String s) {
//				return s;
//			}
//		};
//		
//		Kitchenobject ding2 = new Kitchenobject("fjlsls") {
//			public String testMeth( String s) {
//				return s;
//			}
//		};
//		
//		Person me2 = new Person("Stephan", true);
//		
//		System.out.println("Klasse von ding ist: "+ ding.getClass());
//		System.out.println("Klasse von ding ist: "+ ding2.getClass());
//		System.out.println("Klasse von ding ist: "+ ding.getName());
//		System.out.println("Klasse von ding ist: "+ ding2.getName());
//		System.out.println("Klasse von ding ist: "+ me.getClass());
//		System.out.println("Klasse von ding ist: "+ me2.getClass());
//		
//		System.out.println(me +" = "+ me2 +" -> "+ (me.getClass() == me2.getClass()));
		
		Food carrot = new Vegetable("Carrot", 108, 0.2, "A", "B", "C", "E");
		
		Food brot = new Vegetable();
		
		myFridge.contains.add(carrot);
		
		System.out.println("There are "+myFridge.contains.size()+" item in the fridge");
	}

}
