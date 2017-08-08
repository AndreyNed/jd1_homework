package by.htp.fabric;

public class SaveTarget extends AbstractTarget{

	public SaveTarget(String value) {
		super(value);
	}
	
	public void show(){
		System.out.println("Save: " + super.value);
	}

}
