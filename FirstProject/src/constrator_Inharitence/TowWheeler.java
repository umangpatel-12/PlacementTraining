package constrator_Inharitence;

public class TowWheeler extends Vehicals {
	
	private String fuel;

	
	


	public TowWheeler() {
		super();
		this.fuel = "Petrol ";
	}

	

	@Override
	public String toString() {
		return fuel + super.toString();
	}
	
	public TowWheeler(String fuel, String comp) {
		super(comp);
		this.fuel = fuel;
	}


}
