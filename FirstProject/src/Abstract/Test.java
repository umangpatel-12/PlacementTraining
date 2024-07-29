package Abstract;

public class Test {
	public static void main(String [] args) {
//		
		Animal cat = new Animal() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("cat is runnig");
			}
			
		};
		cat.run();
		
//		Dog g = new Dog();
//		g.run();
	}
}
