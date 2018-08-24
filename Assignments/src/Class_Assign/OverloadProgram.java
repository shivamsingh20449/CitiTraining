package Class_Assign;

public class OverloadProgram {
	
	double area= 0;
	
	public void area()
	{
		System.out.println("area=100");
	}
	
	public void area(int r)
	{
		area= 3.142857*r*r;
		System.out.println("area= "+area);
	}
	
	public void area(int a, int b)
	{
		area= b*a;
		System.out.println("area= "+area);
	}
	
	public void area(int a, int b,int y)
	{
		area= 0.5*b*a;
		System.out.println("area= "+area);
	}
	
	
}
