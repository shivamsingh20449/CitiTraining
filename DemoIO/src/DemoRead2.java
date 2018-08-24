import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoRead2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("enter number 1: ");
			String value1 = br.readLine();
			System.out.println("You entered: "+ value1);
			System.out.println("please enter the value 2: ");
			String value2 = br.readLine();
			System.out.println("You entered: "+ value2);
					
			System.out.println("the bigger of the two numbers is: "+Math.max(new Integer(value1), new Integer(value2)));	// see parse method
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
