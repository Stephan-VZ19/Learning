package kitchen;

public class Person extends Kitchenobject{
	
	public boolean canCook;
	
	public Person( String name, boolean canCook) {
		super(name);
		this.canCook = canCook;
	}
	
	public Person() {
		super();
	}

}
