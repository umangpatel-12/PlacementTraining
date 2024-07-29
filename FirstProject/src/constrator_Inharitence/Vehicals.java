package constrator_Inharitence;

public class Vehicals {
	private String comp;

	@Override
	public String toString() {
		return "Vehicals : " + comp  ;
	}

	public Vehicals() {
		this.comp = "BMW";
	}
	
	public Vehicals(String comp) {
		this.comp = comp;
	}
	

}
