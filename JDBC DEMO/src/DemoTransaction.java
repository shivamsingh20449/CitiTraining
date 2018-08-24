import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoTransaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=CITI", "sa", "sa123");
			
			con.setAutoCommit(false);  //Don't do the changes automatically
			
			System.out.println("connection successful");
			
//			String INSERT_EMPLOYEE = "insert into emp3 values(1,'Citi', 1000)";
//			Statement st= con.createStatement();
//			int rows = st.executeUpdate(INSERT_EMPLOYEE);
//			System.out.println("rows inserted: " + rows);
			
			
			//Either all or none?:
			Statement st= con.createStatement();
			st.execute("insert into emp3 values(910,'Citi91', 1000)");
			st.execute("insert into emp3 values(920,'Citi92', 1000)");
			st.execute("insert into emp3 values(1,'Citi1', 1000)");
			st.execute("insert into emp3 values(940,'Citi94', 1000)");
			
			con.commit();// if all the data have been passed through, without exception only then there will be changes otherwise the changes won' t take place
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		

	}

}
