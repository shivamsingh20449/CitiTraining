import com.connections.EmployeeDAO;
import com.pojos.Employee;

public class TestEmployeeDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee myEmployee = new Employee(12, "ABC", 1200);
		
		EmployeeDAO dao = new EmployeeDAO();
		int rows = dao.addEmployee(myEmployee);
		if(rows>0)
		{
			System.out.println("record inserted successfully");
		}
		else
			System.out.println("Sorry");

	}

}
