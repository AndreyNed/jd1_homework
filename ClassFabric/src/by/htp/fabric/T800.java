package by.htp.fabric;

public class T800 extends Terminator {

	public T800( Target target ) {
		super( target );
	}

	public void showTarget() {
		System.out.println( T800.class.getSimpleName() + " target: " );
		super.showTarget();
	}
	
}
