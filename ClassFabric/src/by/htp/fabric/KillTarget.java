package by.htp.fabric;

public class KillTarget extends AbstractTarget{

	public KillTarget(String value) {
		super(value);
	}
	
	public void show(){
		System.out.println("Kill: " + super.value);
	}

}
