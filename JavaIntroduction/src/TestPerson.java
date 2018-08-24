
public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating a reference
		//cls_name ref_name;
		Person p;				//creating variable and referencing
		
		//allocating memory
		//ref_name = new Cls_name();
		p= new Person();
		// see stack and hip allocation, here it is hip.. (new keyword)
		
		//invoking function
		//ref_name.name_of_fun();
		//p.setValues();
		p.display();
		
		//Person p1;
		p = new Person();
		p.setValues(20, "Shubham");
		p.display();
		
		p = new Person(17, "Another random banda");
		p.display();
		p.setAge(49);
		p.display();
		
	}

}
