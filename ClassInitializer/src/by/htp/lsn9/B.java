package by.htp.lsn9;

public class B extends A {
	
	public static int bB = 1;
	
	static{
		System.out.println("Static B");
	}
	
	{
		super.a = 8;
	}
	
	private int a = 2;

	public B() {
		super();
		//System.out.println("B");
	}
	
	public B( int a ) {
		this();
		//System.out.println("B int a");
	}
	
	public void anything(){
		System.out.println("Do any in B");
	}
	
}
