
public class DemoCommandLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(args[1]);
		System.out.println("number of arguments="+ args.length);
		//System.out.println("args=" + args[0]);
		int a= Integer.parseInt(args[0]);
		int b= Integer.parseInt(args[1]);
		int c= Integer.parseInt(args[2]);
		
		
		//Way 1
		
		int sum= a+b+c;
		System.out.println(sum);
		
		// Way 2
		sum=0;
		
		for(String arg: args)
		{
			sum=sum + Integer.parseInt(arg);
		}
		System.out.println(sum);
	}

}
