import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.beans.Book;
import com.connections.MyConnection;
import com.dao.BookDAO;

public class BookImplementation implements BookDAO {

	@Override
	public boolean addBook(Book book) {
		// TODO Auto-generated method stub
		String Insert_book = "insert into book values(?,?,?)";
		int r = 0;
		try {
			PreparedStatement ps = MyConnection.getMyConnection().prepareStatement(Insert_book);
			
			ps.setString(1, "SBIN0001057");
			ps.setString(2, "random book added");
			ps.setString(3, "Penguin Books");
			ps.setString(4, "Arvind Adiga");
			
			r = ps.executeUpdate();
			return true;

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return false;
	}

	@Override
	public int updateBook(Book book, String ISBN) {
		// TODO Auto-generated method stub
		
		Book book1 = new Book();
		String UPDATE_BOOK = "update book set name=?, publication=?, author=? where isbn=?";
		try {
			PreparedStatement ps = MyConnection.getMyConnection().prepareStatement(UPDATE_BOOK);
			
			ps.setString(1, "daVinci's Code");
			ps.setString(2, "Springer");
			ps.setString(3, "Dan Brown");
			ps.setString(4, ISBN);
			
			int row = ps.executeUpdate();
			if(row>0)
			{
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return 0;
	}

	@Override
	public int deleteBook(String ISBN) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Book findBookByISBN(String ISBN) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> findBooksByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> findAllBooks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> findBooksByAuthor(String auth_name) {
		// TODO Auto-generated method stub
		return null;
	}

}
