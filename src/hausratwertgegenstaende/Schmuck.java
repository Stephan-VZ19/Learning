package hausratwertgegenstaende;

public abstract class Schmuck extends Hausrat{
	
	private String material;

	public Schmuck(String bezeichnung, int wert, String material) {
		super(bezeichnung, wert);
		this.material = material;
	}
	
	

}
