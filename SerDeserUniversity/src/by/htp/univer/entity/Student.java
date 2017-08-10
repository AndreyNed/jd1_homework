package by.htp.univer.entity;

public class Student extends Person {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1502563801075427576L;

	public static String univer;
	
	static {
		univer = "BNTU";
	}
	
	public transient int avg;
	
	private Group group;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	
	
	public Student(String name, int age, Group group) {
		super(name, age);
		this.group = group;
	}



	public Student(String name, int age) {
		super(name, age);
		System.out.println("Student constructtor");
	}

	public Student(String name, int age, int groupNumber) {
		super(name, age);
		this.group = new Group( groupNumber );
		System.out.println("Student with all params");
	}
	
	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public int getGroupNumber() {
		return group.getGroupNumber();
	}

	public void setGroupNumber(int groupNumber) {
		this.group.setGroupNumber(groupNumber);
	}

	@Override
	public String toString() {
		return "Student [Name=" + getName() + ", Age=" + getAge() + ", groupNumber" + group.getGroupNumber() + ", univer" + univer + ", avg: " + avg + "]";
	}

}
