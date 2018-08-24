import java.util.Scanner;

import com.pojo.Employee;

public class TestEmployee1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		Employee emp=new Employee(salary,id,age,name);
		emp.display();
		s1.close();
		s2.close();
		s3.close();
		s4.close();
	}

}
