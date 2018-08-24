package com.pojo;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stud1= new Student();
		

		Scanner s1 = new Scanner(System.in);
		System.out.println("please enter name");
		String name= s1.next();
		stud1.name=name;
		
		Scanner s2 = new Scanner(System.in);
		System.out.println("please enter Roll Number ");
		int roll= s2.nextInt();
		stud1.rollNo=roll;
		
		for(int i=0; i<10; i++)
		{
			Scanner s3 = new Scanner(System.in);
			System.out.println("please enter marks "+ i);
			stud1.marks[i]= s3.nextInt();
		}
		
		stud1.display();
		
		
		

	}

}
