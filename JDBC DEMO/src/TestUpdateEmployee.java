import com.connections.EmployeeDAO;
import com.pojos.Employee;

public class TestUpdateEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int id_update = 12;
		Employee emp = new Employee(0, "up_name", 1234);
		
		EmployeeDAO dao = new EmployeeDAO();
		Employee emp_updated = dao.updateEmployee(id_update, emp);
		
		System.out.println(emp_updated.getName() + ":::"+ emp_updated.getSalary());
		

	}

}
