package Employee;
import java.util.*;

import Student.Employee;

public class ArryofEmployee {
	
	public void ArrayOfEmp() {
		Scanner sc = new Scanner(System.in);
		int[] no = new int[12];
		Employee[] emp = new Employee[10];
		
		for(int i = 0;i<2; i++) {
			emp[i] = new Employee();
		}
		
		for(int i=0;i<2;i++) {
			System.out.println("Enter Name");
			emp[i].setName(sc.next());
			System.out.println("Enter Name");
			emp[i].setEmial(sc.next());
		}
		
		for(int i=0;i<3; i++) {
			System.out.println(emp[i]);
		}
		
	}

}
