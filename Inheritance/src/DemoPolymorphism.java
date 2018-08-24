import com.pojo.Employee;
import com.pojo.Person;

public class DemoPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person e= new Employee();		//superclass reference ; subclass object
		//e.display();					//Display in person has been overridden by the one in employee.. agar employee 										didn't have the method, the superclass method will be executed. It is always 										Object's method
		((Employee)e).display(10);	//down casting done if display(int) is not present in the parent class.
										//down casting is to be done by the programmer..args upcasting is done automatically
	}

}


///COvarient variables

/*class DemoEmployee
{
	public Person printEmployee()
	{
		return null;
	}
}

class DemoChild extends DemoEmployee 
{
	public Employee printEmployee()
	{
		return null;
	}
}
*/