package by.htp.fabric;

public class T2000 extends Terminator {

	public T2000( Target target ) {
		super( target );
	}

	public void showTarget() {
		System.out.println( T2000.class.getSimpleName() + " target: " );
		super.showTarget();
	}
	
}
