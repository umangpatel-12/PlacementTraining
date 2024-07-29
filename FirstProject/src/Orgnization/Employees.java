package Orgnization;

public class Employees {
	
	private String ename;
	private Designation desig;
	


	public Designation getDesig() {
		return desig;
	}



	public void setDesig(Designation desig) {
		this.desig = desig;
	}



	public String getEname() {
		return ename;
	}



	public void setEname(String ename) {
		this.ename = ename;
	}




	@Override
	public String toString() {
		return "Designation [ename=" + ename + ", desig=" + desig + "]";
	}
}
