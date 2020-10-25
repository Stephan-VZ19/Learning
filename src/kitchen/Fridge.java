package kitchen;

import java.util.List;
import java.util.ArrayList;

public class Fridge extends Kitchenobject implements Electric{
	
	public int resistance() {
		return 50;
	}
	
	public Fridge( String name) {
		super( name);
	}
	
	public Fridge() {
		super();
	}
	
	List<Food> contains = new ArrayList<Food>();
	
	public boolean isFull() {
		if (contains.size() > 25) {
			return true;
		}
		else return false;
	}
	
	public boolean isElectric() {
		return true;
	}
	
	
	
}
