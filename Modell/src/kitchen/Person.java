package kitchen;

public class Person extends Kitchenobject{
	
	public boolean canCook;
	
	public Person( String name, boolean canCook) {
		super(name);
		this.canCook = canCook;
		System.out.println("Hello from Person");
	}
	
	public Person() {
		super();
		System.out.println("Hello from Person Default");
	}

}
