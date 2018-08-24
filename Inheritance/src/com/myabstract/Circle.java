package com.myabstract;

public class Circle extends Shape {

	private int radius;
	
	public Circle() {
		// TODO Auto-generated constructor stub
		radius = 10;
	}
		
	public Circle(int radius, String name) {
		super(name);
		this.radius = radius;
	}

	@Override										//can not be changed as the parent class has this method as abstract
	public double area() {
		// TODO Auto-generated method stub
		return 3.14*radius*radius;
	}

}
