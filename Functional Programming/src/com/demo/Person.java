package com.demo;

public class Person {
	
	private int age;
	private String name;			// string is not primitive data-type but is mostly treated like one
	
	public void display() {
		System.out.println("Name: "+ name + "\t"+ "Age= "+ age + "\n");
	}
	
	public void setValues() {
		age = 22;
		name = "Shivam";		
	}
	
	public void setValues(int a, String n)			//overloading
	{
		age = a;
		name = n;
	}
	
	public Person()									//default constructor
	{
		age = 10;
		name= "default name";
	}
	
	public Person(int age, String name)					//Parameterized constructor
	{
		this.age = age;
		this.name= name;
	}

	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//setter function
	/* public void setAge(int a)
	{
		age = a;
	}
	*/
	
	
}
