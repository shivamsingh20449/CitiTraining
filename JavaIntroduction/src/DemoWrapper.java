
public class DemoWrapper 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stubs
		
		Integer obj= new Integer(10);
		Integer obj1= new Integer("10");
		
		int value= obj.intValue();
		
		int data=obj;								// Auto un-boxing
		// int data = obj.intValue();
		
		obj=200;									// Auto Boxing
		//obj= new Integer(200);

	}

}
