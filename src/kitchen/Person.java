package kitchen;

public class Person extends Kitchenobject implements Cooking{
	
	public boolean canCook;
	
	public Person( String name, boolean canCook) {
		super(name);
		this.canCook = canCook;
	}
	
	public Person() {
		super();
	}

	@Override
	public Food cook( Food a, Food b) {
		Food meal = new Food("Mealwith"+a.getName()+b.getName(), a.getCalories() + b.getCalories(), a.getFat() + b.getFat());
		return meal;
	}

}
