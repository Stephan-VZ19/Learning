package hausratwertgegenstaende;

public class Halskette extends Schmuck{
	
	private int laenge; // in cm

	public Halskette(String bezeichnung, int wert, String material, int laenge) {
		super(bezeichnung, wert, material);
		this.laenge = laenge;
	}
	
	

}
