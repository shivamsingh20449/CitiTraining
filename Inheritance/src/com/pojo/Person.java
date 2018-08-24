package com.pojo;

public class Person {
	
	private int age;
	private String name;			// string is not primitive data-type but is mostly treated like one
	
	public void display(int x) {
		System.out.println("Name: "+ name + "\t"+ "Age= "+ age + "\n");
	}
	
	public void setValues() 
	{
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
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Person p = (Person) obj;													//down-casting
		return (p.name.equals(name)&&p.age==this.age);			//p2 ka name is in p.name and the name of p1 is there in (name). p2 is passed as object and p1 is the invoker
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Person [age= "+ age + " name= "+name + "]";
	}
		
}
