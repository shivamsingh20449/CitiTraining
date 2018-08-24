package com.DAO;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.connections.MyConnection;

public class LoginDAO {
	
	public boolean checkLogin(String username, String password)	
	{
		System.out.println(username + password);
		boolean success = false;
		String INSERT_EMPLOYEE = "select * from login_info where id = ? and password = ?";
		//int r = 0;
		
		try {
			
			PreparedStatement ps = MyConnection.getMyConnection().prepareStatement(INSERT_EMPLOYEE);
			ps.setString(1, username);
			ps.setString(2, password);
			System.out.println(ps);			
			ResultSet set = ps.executeQuery();
			if(set.next()) {
				success = true;
			}
//			String p = set.getString(1);
//			if(p.equals(password)) {
//				return true;
//			}
			return success;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}

}
