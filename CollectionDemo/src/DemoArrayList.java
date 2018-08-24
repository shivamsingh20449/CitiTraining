import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> l= new ArrayList();		//ArrayList: supports duplication, is ordered, unsorted
		
		l.add("ABC");
		l.add("XYZ");
		l.add("C");
		l.add("LMN");
		l.add("ABC");
		//l.add(new Double(123.45));
		//l.add(new Object());
		//l.add(new File("data.txt"));		//heterogeneous list can be added.. but modifying will become difficult. not advisable to be used
		
		System.out.println(l);
		
		int size= l.size();		
		System.out.println("Size: "+size);
		
		l.add(2, "NEW DATA");				//index starts with 0
		
		System.out.println(l);
		
		size= l.size();		
		System.out.println("Size: "+size);
		
		boolean found=l.contains("AC");
		if(found)
			System.out.println("data is available");
		else
			System.out.println("data not found");	
		
		Object o = l.get(3);
		System.out.println("your data is object: "+ o);
		System.out.println(l.get(4));
		
		o=l.remove(0);
		System.out.println("your deleted data is object: "+ o);
		
		System.out.println(l);
		size= l.size();		
		System.out.println("Size: "+size);	
		
		boolean remove= l.remove("ABC");
		if(remove)
			System.out.println("removed successfully.. new list: "+ l);
		else
			System.out.println("data not found");
		
		System.out.println(l);
		size= l.size();		
		System.out.println("Size: "+size);
		
		Iterator<String> it= l.iterator();						//note: method is in List. implementation is provided by ArrayList.. because it 																differs according to whether you want to browse through a List or Set. Hence 																internal implementation is provided.
		while(it.hasNext())
		{
			String  data=it.next();
			System.out.println(data);
		}
	}

}
