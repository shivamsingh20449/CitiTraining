
public class TestDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date1= new Date();
		date1.display();
		
		Date date2= new Date(25,1,1996);
		date2.display();
		
		date2.setDay(26);
		date2.setMonth(1);
		
		System.out.println("the changed value of date for date2 is " + date2.getDay()+"-"+ date2.getMonth()+ "-"+ date2.getYear());
		
		
		
		
	}

}
