
public class DemoStatic {
	private float age;
	private String name;
	
	private static int value;
	
	public DemoStatic()
	{
		age=12.12f;
		name = "abcde";
		//value = 10;
		value++;
	}
	
	static
	{
		value = 0;
	}
	
	public void display()
	{
		System.out.println(name+"\t"+age+"\t"+value);
	}
	
	public static void show()
	{
		System.out.println(value);
	}
	
	public static void main(String []args)
	{
		DemoStatic.show();
		DemoStatic d1= new DemoStatic();

		d1.show();
		DemoStatic d2= new DemoStatic();
		DemoStatic d3= new DemoStatic();
		DemoStatic d4= new DemoStatic();
		
		d1.show();
		d2.show();
		d3.show();
		d4.show();
	}
	
}
