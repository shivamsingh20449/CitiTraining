import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DemoHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> m = new HashMap<>();
		m.put("Citi", "Pune");
		m.put("Wipro", "Hinjewadi");
		m.put("Accenture", "Malad");
		
		System.out.println(m);		//Hash is an unordered collection
		
		m.put("Wipro", "Hyderabad");
		
		System.out.println("after duplicate key:\n" + m);
		//It will override the previous value in case we have duplication
		
		//Iteration is not provided by default since there is a key and a value here.. and just a value
		
		Set<Entry<String, String>> entries = m.entrySet();
		Iterator<Entry<String, String>> it = entries.iterator();
		
		while(it.hasNext())
		{
			Entry<String, String> entry = it.next();
			System.out.println(entry.getKey()+"::" + entry.getValue());
		}

	}

}
