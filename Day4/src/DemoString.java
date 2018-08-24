import java.util.Scanner;

public class DemoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="citi";
		System.out.println("init value: "+ name);
		name.concat(", Pune");
		System.out.println("final: " + name);
		name=name.concat(", Pune");
		System.out.println("final2: " + name);			//we need to give an assignment operator otherwise value does not 														get edited
		Scanner s1=new Scanner(System.in);
		System.out.println("please enter a string: ");
		String name1= s1.next();
		name1.concat(" IS the NAME");
		System.out.println("without assignment: " + name1);
		System.out.println("String length without assignment: "+ name1.length());
		System.out.println("Without assignment: "+ name1.getBytes());
		name1= name1.concat(" IS the NAME");
		System.out.println("with assignment: " + name1);
		System.out.println("String length with assignment: "+ name1.length());
		System.out.println("With assignment: "+ name1.getBytes());

		
		String name2=name1;
		//String name3=name1;
		
		name1.toLowerCase();
		System.out.println("without assignment: " + name1);
		name1=name1.toLowerCase();
		System.out.println("with assignment: " + name1);
		
		name2.toUpperCase();
		System.out.println("without assignment: " + name2);
		name2=name2.toUpperCase();
		System.out.println("with assignment: " + name2);
		
		s1.close(); 
		
	}

}
