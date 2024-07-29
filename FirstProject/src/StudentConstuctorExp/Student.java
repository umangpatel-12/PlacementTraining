package StudentConstuctorExp;

public class Student {
	
	private String name;
	private int rollno;
	
	
	//Non Parameter
	public Student() {
		this.name = "Umang";
		this.rollno = 56;
	}

	//Parameter Constructor
	public Student(String name, int rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
	}
	
	//Getter and Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	//toString
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + "]";
	}
	

}
