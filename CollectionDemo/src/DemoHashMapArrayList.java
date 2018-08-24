import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.beans.Book;

public class DemoHashMapArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, List<Book>> m = new HashMap<>();
		
		List<Book> books_java = new ArrayList<>();
		books_java.add(new Book(1, "Java 1", "Oracle", 100d));
		books_java.add(new Book(12, "Java 2", "Oracle", 200d));
		books_java.add(new Book(67, "Adv Java 1", "Oracle", 100d));
		m.put("JAVA", books_java);
		
		List<Book> dotNet = new ArrayList<>();
		dotNet.add(new Book(1, ".NET1", "Microsoft", 100d));
		dotNet.add(new Book(12, ".NET2", "Microsoft", 200d));
		dotNet.add(new Book(67, "C#", "Microsoft", 100d));
		m.put("DOT NET", dotNet);
		
		List<Book> books_stories = new ArrayList<>();
		books_stories.add(new Book(1, "Ramayana", "Publi1", 100d));
		books_stories.add(new Book(12, "Mahabharata", "Publi2", 200d));
		m.put("Stories", books_stories);
		
		System.out.println(m);
		
		Set<Entry<String, List<Book>>> entry = m.entrySet();
		Iterator<Entry<String, List<Book>>> it = entry.iterator();
		while(it.hasNext())
		{
			Entry<String, List<Book>> et= it.next();
			System.out.println("**BOOK CATEGORY: "+ et.getKey() + "**");
			List<Book> books = et.getValue();
			for(Book book:books)
			{
				System.out.println(book.getName() + "---->"+ book.getIsbn());
			}
				
		
		};
				
		
				
	}

}
