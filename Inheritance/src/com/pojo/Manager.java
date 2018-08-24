package com.pojo;

public class Manager extends Employee {
	
	String department;
	double incentive;
	
	public Manager()
	{
		department="Sales";
		incentive= 12345d;
	}
	
	public Manager(String department, double incentive, double empSalary, int empId,int age, String name)
	{
		super(empSalary,  empId, age,  name);
		this.department = department;
		this.incentive = incentive;
		}

	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getIncentive() {
		return incentive;
	}
	public void setIncentive(double incentive) {
		this.incentive = incentive;
	}
	
	
	public void display()
	{
		
		System.out.println("dept:\t"+department+ "\nincentive:\t" + incentive);
		super.display();
	}
	

}
