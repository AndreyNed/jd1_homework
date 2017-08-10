package by.htp.client;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import by.htp.test.A;


public class MainClient {

	private static final String FILE_NAME = "C:\\src_data\\serial_example.txt";
	
	public static void main(String[] args) {
		
		//Student.univer = "BSU";
		//Object studentAfter = deserialize();
		//System.out.println(studentAfter);
		
		A a = ( A )deserialize();
		System.out.println( a.value );
	}
	
	public static Object deserialize(){
		Object obj = null;
		ObjectInputStream ois = null;
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream( FILE_NAME ); 
			ois = new ObjectInputStream( fis );
			obj = ois.readObject();
		} catch ( FileNotFoundException e ) {
			e.printStackTrace();
		} catch ( IOException e ) {
			e.printStackTrace();
		} catch ( ClassNotFoundException e ) {
			e.printStackTrace();
		} finally {

		}
		
		return obj;
		
	}

}
