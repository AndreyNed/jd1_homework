package by.htp.lsn9;

public class A {
	
	public static int aA = 0;
	
	static{
		System.out.println("Static A");
	}
	
	protected int a = 1;
	
	{
		a = 2;
	}

	public A() {
		super();
		
		a = 3;
		
		//System.out.println("A");
	}
	
	{
		a = 4;
	}
	
	public static void doSmth(){
		System.out.println("Do smth in A");
	}
	
	public void anything(){
		System.out.println("Do any in A");
	}
	
	public C methodC (){
		return new C();
	}
}
