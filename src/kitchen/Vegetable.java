package kitchen;

public class Vegetable extends Food{
	
	private String[] vitamins;
	
	public Vegetable( String name, double calories, double fat, String... vitamins) { // varargs is an array!
		super( name, calories, fat);
		this.vitamins = vitamins;
	}
	
	public Vegetable() {
		super();
	}
	
	public String[] getVitamins() {
		return vitamins;
	}

	@Override
	public void getFoodInfos() {
		System.out.println("This "+ getName() +" has following food values: ");
		System.out.println("calories = "+ getCalories());
		System.out.println("fat = "+ getFat());
		for ( String vitamin : vitamins) {
			System.out.println("Vitamin "+ vitamin);
		}
	}
	
}
