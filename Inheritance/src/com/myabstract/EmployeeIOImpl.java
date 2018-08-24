package com.myabstract;

import java.util.Scanner;

import com.pojo.Employee;

public class EmployeeIOImpl implements EmployeeIO 
{

	
	
	@Override
	public Employee readEmployee() 
	{
		// TODO Auto-generated method stub
		Scanner s1= new Scanner(System.in);
		System.out.println("input the salary: ");
		double sal = s1.nextDouble();
		System.out.println("input the id: ");
		int id =s1.nextInt();
		System.out.println("input the age: ");
		int age =s1.nextInt();
		System.out.println("input the name: ");
		String name =s1.next();
		
		
		Employee e= new Employee(sal, id, age, name);
		
		s1.close();
		
		return e;
		//return PI*radius*radius;
		//		return null;
		//s1.close();
	}

	@Override
	public void writeEmployee(Employee employee)
	{
		// TODO Auto-generated method stub
		//whatever you want to have displayed

	}
	
	public static void main(String[] args)
	{
		EmployeeIOImpl e = new EmployeeIOImpl();
		Employee emp = e.readEmployee();
		e.writeEmployee(emp);
	}
	

}
