package by.htp.oop;

public class Teacher extends Person {
	
	private int experience;
	
	public int getExperience() {
		return experience;
	}

	public void setExperiense(int experience) {
		this.experience = experience;
	}
	
	@Override
	public void doSmth(){
		System.out.println("I`m a teacher!");
	}
	
	@Override
	public String saySmth() {
		return "I am very tired!";
	}

	public void print() {
		System.out.println( "-----------------");
		System.out.println( "Teacher: " + this.getName() + "; age: " + this.getAge() + "; experiense: " + experience);
		System.out.println( "-----------------");
	}
	
}
