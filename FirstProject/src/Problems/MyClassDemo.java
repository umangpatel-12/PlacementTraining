package Problems;

public class MyClassDemo {

	public static void main(String[] args)
	   {
	        MyClass myObject1 = new MyClass(5);
	        MyClass myObject2 = new MyClass(7);    
	        
	        myObject1.printX();
	        myObject1.incrementCount();
	        MyClass.incrementCount();
	        myObject1.printCount();
	        myObject2.printCount();
	        myObject2.printX();
	        myObject1.setX(14);
	        myObject2.incrementCount();
	        myObject1.printX();
	        myObject1.printCount();
	        myObject2.printCount();
	   }
}
