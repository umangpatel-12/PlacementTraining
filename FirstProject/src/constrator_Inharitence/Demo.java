package constrator_Inharitence;


public class Demo {
	
	public static void main(String [] args) {
		TowWheeler tw = new TowWheeler();
		System.out.println(tw);
		
		TowWheeler tw1 =new TowWheeler("Petrol ","FORD");
		System.out.println(tw1);
		
		
		Vehicals v  = new Vehicals();
		System.out.println(v instanceof Vehicals);
	}

}

///