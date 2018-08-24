
public class Employee {
	private int empId;
	//private double salary;
	private String empName;
	//private String companyName;
	private static int empCount;
	
	static {
		empCount= 36;
	}
	
		
	public Employee()
	{
		//this (12, "haaskh", 1200);
		empId = 10;
		empName= "citi";
		//salary = 1000d;
		//companyName= "Citi Ltd";
		empCount++;
	}
	
	public Employee (int empId, String empName)
	{
		this();
		this.empId = empId;
		this.empName= empName;
		//this.salary= salary;
		empCount++;
				
	}
	
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public static int getEmpCount() {
		return empCount;
	}

	public static void setEmpCount(int empCount) {
		Employee.empCount = empCount;
	}

	public void displayEmployee()
	{
		System.out.println(empName+"\t"+empId+"\t");
	}
	
	public static void showCount()
	{
		System.out.println(empCount);
	}
	
	public static void main(String []arg)
	{
		Employee emp = new Employee(1200, "emp name1");
		emp.displayEmployee();
		Employee emp2 = new Employee(120, "emp name2");
		emp2.displayEmployee();
		Employee emp3 = new Employee(10, "emp name3");
		emp3.displayEmployee();
		Employee emp4 = new Employee(200, "emp name3");
		emp4.displayEmployee();
		emp4.showCount();
	}
}
