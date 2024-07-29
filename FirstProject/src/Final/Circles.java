package Final;

public class Circles {
	private double r;
	
	private final float pi;
	
	public Circles() {
		pi = 3.14f;
		this.r = 3.4;
	}

	
	
	public double GetArea() {
		return pi*r*r;
	}
 }
