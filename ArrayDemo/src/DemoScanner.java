import java.util.Scanner;

public class DemoScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("please enter number");
		int num= s.nextInt();
		
		System.out.println("please enter number");
		int num1= s.nextInt();
		
		int num3=num+num1;
		System.out.println(num3);
	}

}
