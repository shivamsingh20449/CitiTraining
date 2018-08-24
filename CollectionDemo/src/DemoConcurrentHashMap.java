import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class DemoConcurrentHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> map = new ConcurrentHashMap<>();
		map.put("A", "India");
		map.put("B", "Sri Lanka");
		map.put("CV", "Germany");
		map.put("z", "USA");
		
		Set<Entry<String, String>> entries = map.entrySet();
		Iterator<Entry<String, String>> iterator = entries.iterator();
		while(iterator.hasNext())
		{
			Map.Entry<String, String> entry = iterator.next();
			
			if(entry.getKey().equals("A"))
				map.put("X", "NEW COUNTRY");
			
		}
		
		System.out.println(map);

	}

}
