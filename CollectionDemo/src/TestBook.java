import java.util.Scanner;

import com.beans.Book;
import com.impl.Implementation1;
import com.impl.Implementation2;

public class TestBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Implementation1 imp1 = new Implementation1();
		Implementation2 imp2= new Implementation2();
		
		Book b= new Book(123, "Adv Java", "Oracle", 1234d);
		imp2.addBook(b);
		b= new Book(123, "Adv Java", "My Publication", 1234d);
		imp2.addBook(b);
		
		Scanner s1= new Scanner(System.in);
		System.out.println("Please select your option: \n"+"1. ADD\n"+"2.Update"+"3. Find through id");
		int option = Integer.parseInt(s1.next());
		
		switch(option)
		{
		case 1:
			Book newBook = imp2.;
			
			break;
			
		case 2:
			System.out.println("Please select one: \n1. Remove \n2. Show file \n3.Search by name");
			int opt= Integer.parseInt(s1.next());
			switch(opt)
			{
			case 1:
				
				break;
				
			case 2:
				
				break;
			case 3:
				System.out.println("please enter the name of the book");
				String searchName= new String(s1.next());
				imp2.findBooksByName(searchName);
			default:
				System.out.println("Please enter a valid input");
				break;
			}
			break;
		
		case 3:
			System.out.println("Please enter the isbn: ");
			int opt1= Integer.parseInt(s1.next());
			Book bookSearch = new Book(opt1);
			Book searchResult = imp2.findBook(bookSearch);
			if(searchResult.equals(null))
			{
				System.out.println("could not find the book");
				
			}
			else
				imp1.printBook(searchResult);
			break;
			
		case 4:
			System.exit(0);
			break;
			
			default:
				System.out.println("please enter valid input");
				break;
			
		}

	}

}
