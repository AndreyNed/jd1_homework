package by.htp.fabric.run;

import by.htp.fabric.Terminator;
import by.htp.fabric.TerminatorFactory;

public class App {

	public static void main(String[] args) {
		
		Terminator t800;
		Terminator t1000;
		Terminator t2000;
		
		t800 = TerminatorFactory.getTerminator("T800");
		t800.showTarget();
		t1000 = TerminatorFactory.getTerminator( "T1000" );
		t1000.showTarget();
		t2000 = TerminatorFactory.getTerminator( "T2000" );
		t2000.showTarget();
	}

}
