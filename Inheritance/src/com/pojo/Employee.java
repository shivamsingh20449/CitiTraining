package com.pojo;

public class Employee extends Person 
{
	private double empSalary;
	private int empId;
	
	public Employee()
	{
		super();								//default constructor of superclass gets invoked. Not necessary to put as 												it gets invoked automatically.
		empId=0;
		empSalary=1000;
	}
	
	public Employee(double empSalary, int empId,int age, String name) 
	{
		//super(25, "parameterized name");
		super(age,name);
		this.empSalary = empSalary;				//Scopes: local, class and object. this pointer stores the value of the 												reference
		this.empId = empId;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public void display()
	{
		System.out.println(empId  + "\t"+ empSalary);
		//System.out.println("Name: "+ this.getName());
		//display();    											// by default it means this.display.. recursion occurs.
		//super.display();  											//Function over riding.. in overriding, you can not 																	reduce the visibility.
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+ empId + " " +empSalary;
		//this.display();
	}
	
	
}
