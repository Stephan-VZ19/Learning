package hausratwertgegenstaende;

public abstract class Hausrat {
	
	private String bezeichnung;
	private int wert; // in Franken
	
	public Hausrat(String bezeichnung, int wert) {
		super();
		this.bezeichnung = bezeichnung;
		this.wert = wert;
	}
	

}
