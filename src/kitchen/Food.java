package kitchen;

public abstract class Food extends Kitchenobject{
	
	private double calories;
	private double fat;
	
	public Food(String name, double calories, double fat) {
		super(name);
		this.calories = calories;
		this.fat = fat;
	}
	
	public Food() {
		super();
	}
	
	public double getCalories() {
		return calories;
	}

	public double getFat() {
		return fat;
	}

	public void getFoodInfos() {
		System.out.println("This Food: "+ getName() +" has "+ calories +" calories and "+ fat +" fat. ");
	}
}
