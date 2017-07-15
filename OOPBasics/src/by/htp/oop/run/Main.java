package by.htp.oop.run;
import by.htp.oop.Person;
import by.htp.oop.Student;
import by.htp.oop.Teacher;
import by.htp.oop.Worker;

public class Main {
	
	public static void print( Person[] people ){
		for ( int i = 0; i < people.length; i++ ) {
			if ( people[ i ] != null ) {
				people[ i ].print();
				System.out.println(people[ i ].saySmth());
			}
		}
	}

	public static void main(String[] args) {
		//Person p = new Person();
		
		//p.setName("John Lennon");
		//p.setAge(30);
		
		//p.print();
		
		Student st = new Student();
		st.setName("Nicholas");
		st.setAge(20);
		st.setCourse(4);
		
		st.print();
		
		Teacher teach = new Teacher();
		teach.setName("Peter");
		teach.setAge(35);
		teach.setExperiense(15);
		
		teach.print();
		
		Worker w = new Worker();
		w.setName("Mary");
		w.setAge(25);
		w.setSpeciality("system administrator");
		
		w.print();
				
		Person[] people = { st, teach, w };
		
		for ( Person person: people ) {
			if ( person != null ) {
			
				if ( person.getClass().equals(Student.class) ){
					Student st1 = (Student)person;
					st1.doSmth();
				}
				else if ( person.getClass().equals(Teacher.class) ) {
					Teacher teach1 = ( Teacher )person;
					teach1.doSmth();
				}
				else if ( person.getClass().equals(Worker.class) ) {
					Worker w1 = ( Worker )person;
					w1.doSmth();
				}
			}
/*			else {
				person.doSmthPerson();
			}*/
		}
		
		print( people );
		
	}

}
