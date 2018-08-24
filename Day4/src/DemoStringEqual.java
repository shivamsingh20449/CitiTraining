
//see page 6

public class DemoStringEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name= "citi";
		System.out.println("init value: " + name);
		String name1= "citi";
		
		if(name1.equals(name))
		{
			System.out.println("equal");
		}
		else
			System.out.println("not equal");
		
		if(name1==name)
		{
			System.out.println("equal");
		}
		else
			System.out.println("not equal");
		
		String name3= "citi";
		System.out.println("init value 3: " + name);
		String name4= new String("citi");
		
		if(name3.equals(name4))								//compares values
		{
			System.out.println("equal");
		}
		else
			System.out.println("not equal");
		
		if(name3==name4)									//compares reference
		{
			System.out.println("equal");
		}
		else
			System.out.println("not equal");
		
		
		
			
	}

}
