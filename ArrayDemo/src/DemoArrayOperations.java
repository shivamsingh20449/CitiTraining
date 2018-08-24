import java.util.Arrays;

public class DemoArrayOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = {123, 34,55, 65, 43,55, 6,89,90};
		///////////////////////////////////////////////////////////////////////////
		//Arrays.fill(numbers, 0);
		
		/*for(int num: numbers)
		{
			System.out.println(num);
		}*/
		//////////////////////////////////////////////////////////////////////////
		/*
		Arrays.fill(numbers, 1, 3, 100);
		
		for(int num: numbers)
		{
			System.out.println(num);
		}
		*/
		
		int[] arr_copy=Arrays.copyOf(numbers, 5);
		for(int num: arr_copy)
		{
			System.out.println(num);
		}
		
		//double[] arr_copy2= Arrays.copyOfRange(numbares, 3, 5);
		
		
		//------------------------------COMPARISION----------------------------------------------//
		String [] names= {"ABC","XYZ","LMN","ASDF"};
		String [] names1= {"ABC","XYZ","LMN","ASDF"};
		
		boolean data = Arrays.equals(names, names1);
		if(data)
		{
			System.out.println("Equal");
		}
		
		
		
		
		System.out.println("--------------------------Sorting---------------------");
		Arrays.sort(numbers);
		
		for(int num: numbers)
		{
			System.out.println(num);
		}
		
		System.out.println("--------------------------Binary Search---------------------");
		int index=Arrays.binarySearch(numbers, 1243);
		System.out.println(index);
		
		
	}

}
