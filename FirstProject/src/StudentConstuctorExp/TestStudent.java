package StudentConstuctorExp;

public class TestStudent {
	
	public static void main(String args[]) {
		
		
		//Parameter Constructor
		
		Student st = new Student("Umang",38);
		System.out.println(st);

		//Non-Parameter Constructor
		Student st1 = new Student();
		System.out.println(st1);
		
		
	}

}
