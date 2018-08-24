import java.util.ArrayList;

public class DemoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList list= new ArrayList();
		list.add(10);	
		list.add(new Integer(234));
		list.add(90);
		list.add(67);
		list.add(10);				//duplicate element.. will it be included? checked by matching size
		
		System.out.println("no of elements=" + list.size());
		System.out.println(list);
		
		list.add(3456);
		list.add(2, 2000);
		
		System.out.println("no of elements=" + list.size());
		System.out.println(list);
		
		list.remove(0);
		list.remove(new Integer(3456));
		System.out.println("After Removal \n no. of elements=" + list.size());
		System.out.println(list);
		

	}

}
