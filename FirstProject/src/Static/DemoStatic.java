package Static;

public class DemoStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVar sv= new StaticVar();
		System.out.println(StaticVar.cnt +""+ sv);
		
		StaticVar sv1= new StaticVar();
		System.out.println(StaticVar.cnt+""+ sv1);
		
		StaticVar sv2= new StaticVar();
		System.out.println(StaticVar.cnt+""+ sv2);
		
		StaticVar sv3= new StaticVar();
		System.out.println(StaticVar.cnt+""+ sv3);
	}

}
