import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;

import com.pojo.Student;

public class DemoSerialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		String name = null;
		int roll = 0;
		int total = 0;
		
		try {
			System.out.println("please neter your name: ");
			name=br.readLine();
			System.out.println("You entered: "+name);
			
			System.out.println("please neter your roll: ");
			roll=br1.read();
			System.out.println("You entered: "+roll);
			
			System.out.println("please neter your total: ");
			total=br2.read();
			System.out.println("You entered: "+total);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Student student= new Student(roll, total, name);
		
		
		try {
			FileOutputStream fo = new FileOutputStream("student.txt");
			ObjectOutputStream oo = new ObjectOutputStream(fo);			//object input and output in/to a file
			
			oo.writeObject(student);
			
			oo.close();
			fo.close();
			
			System.out.println("Operation Completed");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

}
