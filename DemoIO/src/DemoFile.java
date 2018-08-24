import java.io.File;
import java.io.IOException;

public class DemoFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File myFile = new File("myFile.txt");								//created reference and not file
		try {
			myFile.createNewFile();											//File Creation
			System.out.println("file created successfully");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
