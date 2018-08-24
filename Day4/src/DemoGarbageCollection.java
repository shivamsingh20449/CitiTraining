
public class DemoGarbageCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person person= new Person();
		Person person1= new Person();
		Person person2= new Person();
		Person person3= new Person();
		
		System.gc();   									//don't use this.. use person = null;
		
	}

}
