package by.htp.oop;

public class Worker extends Person {
	
	private String speciality;
	
	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	@Override
	public void doSmth(){
		System.out.println("I`m a worker!");
	}
	
	@Override
	public String saySmth() {
		return "I am angry!";
	}

	public void print() {
		System.out.println( "-----------------");
		System.out.println( "Worker: " + this.getName() + "; age: " + this.getAge() + "; speciality: " + speciality );
		System.out.println( "-----------------");
	}
	
}
