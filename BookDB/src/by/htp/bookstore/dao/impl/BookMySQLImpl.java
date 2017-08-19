package by.htp.bookstore.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import by.htp.bookstore.dao.BookDao;
import by.htp.bookstore.domain.entity.Book;

public class BookMySQLImpl implements BookDao {
	
	private static final String DB_URL = "jdbc:mysql://localhost/bookcatalog?useUnicode=true&useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private static final String DB_USR = "root";
	private static final String DB_PAS = "root";

	@Override
	public List<Book> readBooks() {
		
		List<Book> books = null;
		
		try{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cn = DriverManager.getConnection(DB_URL, DB_USR, DB_PAS);
			
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery("select * from book");
			books = new ArrayList<Book>();
			
			while ( rs.next() ){
				int id = rs.getInt(1);
				String title = rs.getString(2);
				int pages = rs.getInt(3);
				
				Book book = new Book( id, title, pages );
				books.add(book);
				
				
			}
		}
		catch( SQLException e ){
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return books;
	}
	
}
