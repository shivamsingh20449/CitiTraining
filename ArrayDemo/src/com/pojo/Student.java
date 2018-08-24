package com.pojo;

import java.util.Arrays;

public class Student {

	String name;
	int[] marks= new int[10];
	int rollNo;
	public Student(String name, int[] marks, int rollNo) {
		super();
		this.name = name;
		this.marks = marks;
		this.rollNo = rollNo;
	}
	
	public Student() {
		name="Random";
		Arrays.fill(marks, 0);
		rollNo = 1234;
		
		
	}
	
	public void display()
	{
		System.out.println("Name:"+name+"\t roll number: "+rollNo+ "\nmarks obatined:");
		for(int mrks: marks)
		{
			System.out.println(mrks);
		}
	}
	
	
}
