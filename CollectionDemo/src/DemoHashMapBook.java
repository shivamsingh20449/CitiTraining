import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.beans.Book;

public class DemoHashMapBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Book> m = new HashMap<>();
		m.put("Citi", new Book());
		m.put("Wipro", new Book(1111));
		m.put("Accenture", new Book(11, "Java for dummies", "S chand", 1212));
		
		System.out.println(m);		//Hash is an unordered collection
		
		m.put("Wipro", new Book(88, "ABCD", "QWERTY", 9098));
		
		System.out.println("after duplicate key:\n" + m);
		//It will override the previous value in case we have duplication
		
		//Iteration is not provided by default since there is a key and a value here.. and just a value
		
		Set<Entry<String, Book>> entries = m.entrySet();
		Iterator<Entry<String, Book>> it = entries.iterator();
		
		while(it.hasNext())
		{
			Entry<String, Book> entry = it.next();
			System.out.println(entry.getKey()+"::" + entry.getValue());
		}

	}

}
