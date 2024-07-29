package OrgDemo;

import Orgnization.*;

public class EmployeeDemo {

	public static void main(String[] args) {
		Designation dg = new Designation();
		dg.setDesig("Webdevloper");
		dg.setDesc("ABCD");
		
		Employees emp = new Employees();
		emp.setEname("Rakesh");
		emp.setDesig(dg);
		System.out.println(emp);
		
		

	}

}
