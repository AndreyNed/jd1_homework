package by.htp.lsn9;

public class C extends B {
	
	public static int cC = 2;
	
	static{
		cC = 8;
		System.out.println("Static C");
	}
	
	private int a = 3;

	public C() {
		super( 5 );
		//System.out.println("C");
	}
	
	public static void doSmth(){
		System.out.println("Do smth in C");
	}
	
/*	public void anything(){
		System.out.println("Do any in C");
	}*/
	
}
