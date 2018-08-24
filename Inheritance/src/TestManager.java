import java.util.Scanner;

import com.pojo.Manager;

public class TestManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Manager m1= new Manager();
		//m1.display();
		
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter name of the employee:");
		String name= s1.nextLine();
		
		Scanner s2= new Scanner(System.in);
		System.out.println("Enter age of the employee:");
		int age= s2.nextInt();
		
		Scanner s3= new Scanner(System.in);
		System.out.println("Enter id of the employee:");
		int id= s2.nextInt();
		
		Scanner s4= new Scanner(System.in);
		System.out.println("Enter salary of the employee:");
		double salary= s4.nextInt();
		
		Scanner s5= new Scanner(System.in);
		System.out.println("Enter incentive of the employee:");
		double incentive= s5.nextInt();
		
		Scanner s6= new Scanner(System.in);
		System.out.println("Enter department of the employee:");
		String department= s6.nextLine();
		
		
		Manager m1= new Manager(department, incentive, salary, id, age, name);
		m1.display();
		s1.close();
		s2.close();
		s3.close();
		s4.close();
		s5.close();
		s6.close();
	}
	
}