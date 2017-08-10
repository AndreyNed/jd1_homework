package by.htp.server.run;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectOutputStream;

import by.htp.test.A;
import by.htp.univer.entity.Group;
import by.htp.univer.entity.Student;



public class MainServer {
	private static String FILE_NAME = "C:\\src_data\\serial_example.txt";
	
	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos;
		ObjectOutputStream oos = null;
		Group group = new Group(5);
		Student student = new Student( "Vasia", 100, group );
		A a = new A();
		a.value = "A";
		try{
			fos = new FileOutputStream( FILE_NAME );
			oos = new ObjectOutputStream( fos );
			student.univer = "BSUIR";
			student.avg = 5;
			//oos.writeObject( student );
			oos.writeObject(a);
		} 
		catch( NotSerializableException e ) {
			e.printStackTrace();
		}
		catch ( FileNotFoundException e ){
			e.printStackTrace();
		}
		catch ( IOException e ) {
			e.printStackTrace();
		}
		finally {
			oos.close();
		}
		

		

	}

}
