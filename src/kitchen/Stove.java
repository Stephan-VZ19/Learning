package kitchen;

public class Stove extends Kitchenobject implements Electric{
	
	int voltage = 230;
	
	public boolean isElectric() {
		return true;
	}
	
	public int resistance() {
		return 100;
	}
	
}
