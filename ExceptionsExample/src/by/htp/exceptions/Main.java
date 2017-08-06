package by.htp.exceptions;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		
		//boolean 
		
		/*Throwable tr = new Throwable();
		
		Exception ex = new Exception();
		
		Error er = new Error();
		
		String s = null;
		s.chars();
		
		throw new Throwable("Something wrong happened");*/
		
		/*File f = new File( "c:\\some.txt" );
		String s = null;
		try {
			s = f.getCanonicalPath();
			generateIOProblem( true );
			generateSQLProblem();
		} catch (IOException e) {
			System.out.println("Problem IO exists");
			//e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Problem SQL exists");
		}
		finally {
			System.out.println("Final message");
		}*/
		try {
			SmClass s = new SmClass();
			s.Method();
		} catch (Exception e) {
			System.out.println("Exception in static method");
			e.printStackTrace();
		}

		System.out.println(  );
		
	}
	
	public static void generateIOProblem( boolean value ) throws IOException{
		if ( !value ) {
			throw new IOException();
		}
	}
	
	public static void generateSQLProblem() throws SQLException{
		throw new SQLException();
	};

}
