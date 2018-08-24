import java.util.ArrayList;
import java.util.List;

import com.beans.Book;

public class DemoBookArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Book> books= new ArrayList<Book>();
		
		books.add(new Book());			//make sure that you initialize default const with values. otherwise Nullptr error
		books.add(new Book(123, "Adv Java", "Oracle", 1234d));
		books.add(new Book(300, "Adv Java", "Oracle", 2000d));
		books.add(new Book(123, "Adv Java", "Oracle", 1234d));
		
		System.out.println("number of books: "+ books.size());
		System.out.println(books);				//here Book doesn't have toString()
		
		Book book_to_search = new Book(300, "Adv Java", "Oracle", 2000d);
		boolean found= books.contains(book_to_search);				//reference equalization.. can use .equals method for comparing the user defined objects. but there is an .equals method already which compares reference.. override it
		
		boolean removed= books.remove(book_to_search);		//reference matching if there is no .equals present overridden already. but we need to match values.
		System.out.println("removed: "+ removed);
		
		if(found)	
		{
			System.out.println("book found");
		}
		else
			System.out.println("Not found");
		
	}

}
