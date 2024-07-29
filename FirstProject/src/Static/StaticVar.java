package Static;

public class StaticVar {
	static String msg = "Let's start coding";
	static int cnt=0;
	int i = 0;
	
	public StaticVar() {
		cnt++;
		i++;
	}
	
//	static{
//		System.out.println("Hello");
//	}
	
	@Override
	public String toString() {
		return "StaticVar [i=" + i + "]";
	}
	
}
