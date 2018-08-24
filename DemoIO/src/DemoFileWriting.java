import java.io.FileWriter;
import java.io.IOException;

public class DemoFileWriting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileWriter fileWr= new FileWriter("abc.txt",true);			//by default it is false.. true allows appending
			fileWr.write("Citi, Pune");
			
			System.out.println("File is created and the date is inserted");
			
			fileWr.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
