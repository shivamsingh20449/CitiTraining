
public class Demo1D 
{

	public static void main(String[] args)
	{
		int[] numbers;				//declaration 
		//int sum = 0;
		numbers = new int[3];		//allocation of memory block
		
		// System.out.println(numbers[0]);
		
		numbers[0]=100;
		numbers[1]=200;
		numbers[2]=100;
		//numbers[3]=1001;
		
		/*System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		*/
		//int i;
		for(int i=0;i<numbers.length;i++)
		{
			System.out.println(numbers[i]);
		}
		
		for (int x: numbers)
		{
			System.out.println(x);
		}
		
		
		//sum= add(numbers);
		/*
		sum=sum+numbers[0];
		sum=sum+numbers[1];
		sum=sum+numbers[2];
		
		System.out.println("the sum of the above numbers is : " + sum);
			*/	
	}
	
	public static int add(int[] numbers)
	{
		return (numbers[0]+numbers[1]+numbers[2]);
	}

}
