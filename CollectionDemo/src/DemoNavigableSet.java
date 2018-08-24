import java.util.NavigableSet;
import java.util.TreeSet;

public class DemoNavigableSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NavigableSet<String> set = new TreeSet<>();
		
		set.add("Germany");
		set.add("USA");
		set.add("Switzerland");
		set.add("India");
		set.add("Russia");
		
		System.out.println(set);
		
		System.out.println(set.headSet("Switzerland", true));
		System.out.println(set.tailSet("Germany", true));
		
	}

}
