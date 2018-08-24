// Only for java 1.8 and above

public interface DemoInterface1_8 {
	
	void display();
	 default void description()
	 {
		 System.out.println("hello from the interface");
	 }
	 
	 static void count()
	 {
		 System.out.println("hello from count");
	 }

}
