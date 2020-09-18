package kitchen;

public abstract class Kitchenobject {
	
	private String name;	

	public String getName() {
		return name;
	}

	public Kitchenobject(String name) {
		super();
		this.name = name;
		System.out.println("Hello from Kitchenobject");
	}
	
	public Kitchenobject() {
		super();
		System.out.println("Hello from Kitchenobject Default");
	}

}
