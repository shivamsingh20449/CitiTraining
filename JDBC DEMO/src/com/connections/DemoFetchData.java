package com.connections;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoFetchData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con = MyConnection.getMyConnection();
		String FIND_ALL_EMPLOYEE = "select * from emp3"	;
		
		try {
//			Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			
			Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet set = st.executeQuery(FIND_ALL_EMPLOYEE);
			
			DatabaseMetaData metaData = con.getMetaData();
			System.out.println(metaData.getDatabaseProductName());
			
			ResultSetMetaData resultSetMetaData = set.getMetaData();
			
			System.out.println("number of columns: "+ resultSetMetaData.getColumnCount());
			for(int i = 1; i<resultSetMetaData.getColumnCount(); i++)
			{
				System.out.println(resultSetMetaData.getColumnLabel(i));
			}
			
			
			
			
//			while(set.next())
//			{
//				int empId = set.getInt(1);
//				String name = set.getString(2);
//				int salary = set.getInt(3);
//				System.out.println(empId + " "+ salary + " "+ name);
//				set.updateInt(3, 15000);
//				set.updateRow();
//				System.out.println(empId + " "+ salary + " "+ name);

//			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
