/**Конструкторы*/
package by.htp.lsn9;

public class Main {

	public static void main(String[] args) {
		
		Object obj = new C();
		A a = new C();
		B b = new C();
		C c = new C();
		
		A aa = new A();
		
		/*System.out.println("aA: " + A.aA);
		System.out.println("B.bB: " + B.bB);
		System.out.println("B.aA: " + B.aA);
		System.out.println("C.cC: " + C.cC);
		System.out.println("C.bB: " + C.bB);
		System.out.println("C.aA: " + C.aA);*/

		Main main = new Main();
		//main.doSmth();
		
		if ( a instanceof A ) System.out.println("A!!!");
		if ( a instanceof B ) System.out.println("B!!!");
		if ( a instanceof C ) System.out.println("C!!!");
		if ( a instanceof D ) System.out.println("D!!!");
		
		/*a.doSmth();
		a.anything();
		b.doSmth();
		b.anything();
		c.doSmth();
		c.anything();
		aa.doSmth();
		aa.anything();*/
		
		
		//System.out.println("C.c " + C.cC );
		
	}
	
	public void doSmth(){
		
	}

}
