package by.htp.bookstore.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import by.htp.bookstore.dao.AbstractDao;
import by.htp.bookstore.dao.BookDao;
import by.htp.bookstore.dao.DaoException;
import by.htp.bookstore.domain.entity.Book;

public class BookMySQLImpl extends AbstractDao implements BookDao {

	private static final String DB_URL = "jdbc:mysql://localhost/bookcatalog?useUnicode=true&useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private static final String DB_USR = "root";
	private static final String DB_PAS = "root";
	private static final String SQL_INSERT_BOOK = "INSERT INTO book (`title`, `pages`) VALUES ( ?, ? )";
	private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String SQL_SELECT_BOOK = "select * from book where id = ?";

	@Override
	public List<Book> readBooks() {

		List<Book> books = null;

		try {

			Class.forName(DB_DRIVER);
			Connection cn = DriverManager.getConnection(DB_URL, DB_USR, DB_PAS);

			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery("select * from book");
			books = new ArrayList<Book>();

			while (rs.next()) {
				int id = rs.getInt(1);
				String title = rs.getString(2);
				int pages = rs.getInt(3);

				Book book = new Book(id, title, pages);
				books.add(book);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return books;
	}

	@Override
	public Book readBook(int id) throws DaoException {
		PreparedStatement ps = null;
		Connection cn = null;
		ResultSet rs = null;
		Book book = null;
		
		try {
			
			Class.forName(DB_DRIVER);
			cn = DriverManager.getConnection(DB_URL, DB_USR, DB_PAS);
			
			ps = cn.prepareStatement(SQL_SELECT_BOOK);
			ps.setInt(1, id);
			
			rs = ps.executeQuery();
			if ( rs.next() ) {
				book = new Book();
				book.setId(rs.getInt("id"));
				book.setTitle(rs.getString("title") );
				book.setPageCount(rs.getInt("pages"));
			}
			
		} catch (ClassNotFoundException e) {
			throw new DaoException( "Driver was not found", e );
		} catch (SQLException e) {
			throw new DaoException( "Problem with reading book", e );
		}
		finally{
			closeConnection( cn );
		}
		
		
		return book;
	}

	@Override
	public void deleteBook(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addBook(Book book) throws DaoException {
		PreparedStatement ps = null;
		Connection cn = null;

		try {
			Class.forName(DB_DRIVER);

			cn = DriverManager.getConnection(DB_URL, DB_USR, DB_PAS);

			try {
				ps = cn.prepareStatement(SQL_INSERT_BOOK);

				ps.setString(1, book.getTitle());
				ps.setInt(2, book.getPageCount());
				// ps.executeQuery();
				ps.executeUpdate();
			} catch (SQLException e) {
				throw new DaoException("Problem with adding new book", e);
			} finally {
				closeStatement(ps);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			throw new DaoException("Problem with database connection", e);
		} finally {
			closeConnection(cn);
		}
	}

	@Override
	public void updateBook(Book book) {
		// TODO Auto-generated method stub

	}

}
