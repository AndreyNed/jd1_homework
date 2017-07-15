package by.htp.oop;

public class Student extends Person {
	
	private int course;
	
	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}
	
	@Override
	public void doSmth(){
		System.out.println("I`m a student!");
	}
	
	@Override
	public String saySmth() {
		return "I am tired!";
	}

	public void print() {
		System.out.println( "-----------------");
		System.out.println( "Student: " + this.getName() + "; age: " + this.getAge() + "; course: " + course);
		System.out.println( "-----------------");
	}
}
