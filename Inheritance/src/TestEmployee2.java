import com.pojo.Person;

public class TestEmployee2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person(12, "ABC");
		Person p2 = new Person(12, "ABC");
		
		if (p1==p2)
		{
			System.out.println("both are equal");
		}
		else
			System.out.println("not equal");
		
		if (p1.equals(p2))										//when not overridden, .equals is a function of class object. also, the parent class has no idea what is there in the child class.. so can not see the values and can not compare 
		{
			System.out.println("both are equal");
		}
		else
			System.out.println("not equal");
	}

}
