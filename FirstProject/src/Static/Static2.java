package Static;

public class Static2 {
static int count = 0;
	
	int i = 0;
	
	public Static2() {
		count++;
		i++;
	}
	
	@Override
	public String toString() {
		return "Static2 [i=" + i + "]";
	}
}
