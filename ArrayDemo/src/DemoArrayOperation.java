
public class DemoArrayOperation {

	public static void main(String[] args) 
	{
		
		int i=0;
		
		int[]arrays1= {12,34,44,54,34,55,65,78,90,23,90};
		
		while(i<arrays1.length)
		{
			System.out.print(arrays1[i]+"  ");
			i++;
		}
		
		i=0;
		
		/*do
		{
			System.out.print(arrays1[i]+"  ");
			i++;			
		} while(i<arrays1.length);
		*/
		
		System.out.println();
		
		int search= 54;
		boolean flag=false;
		i=0;
		
		while(i<arrays1.length)
		{
			if(arrays1[i]==search)
				flag=true;
			i++;
		}
		
		if(flag==true)
			System.out.println("value found");
		else
			System.out.println("value not found");
		
		}
	
		

}
