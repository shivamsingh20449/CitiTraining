import com.myabstract.EmployeeIO;
import com.pojo.Employee;

public class DemoMyClass {

	public static void main(String[] args) {
		
		EmployeeIO empIO= new EmployeeIO() {
			
			@Override
			public void writeEmployee(Employee employee) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public Employee readEmployee() {
				// TODO Auto-generated method stub
				return null;
			}
		}; 
		Employee emp= empIO.readEmployee();
		empIO.writeEmployee(emp);
		
			
	}
	
	}
