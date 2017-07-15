package by.htp.oop;

public abstract class Person {

	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public abstract void print(); /*{
		System.out.println("-----------------");
		System.out.println("Person: " + name + "; age: " + age);
		System.out.println("-----------------");
	}*/
	
	public abstract void doSmth(); /*{
		System.out.println("I`m a person!");
	}*/
	
	public abstract String saySmth(); /*{
		return "I am hungry!";
	}*/
	
}
