package kitchen;

public abstract class Food extends Kitchenobject{
	
	private double calories;
	private double fat;
	
	public Food(String name, double calories, double fat) {
		super(name);
		this.calories = calories;
		this.fat = fat;
		System.out.println("Hello from Food");
	}
	
	public Food() {
		super();
		System.out.println("Hello from Food Default");
	}
	
	public double getCalories() {
		return calories;
	}

	public double getFat() {
		return fat;
	}

	public abstract void getFoodInfos();

}
