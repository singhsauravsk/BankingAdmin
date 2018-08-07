package com.zycus.db.dao;

import java.util.Map;
import java.util.HashMap;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import com.zycus.pojo.users.User;
import java.sql.PreparedStatement;
import com.zycus.db.util.ConnectionUtil;
import com.zycus.exceptions.LoginException;

public class UserDao {
	private static final String SELECT_ALL = "select username, password from users";
	
	public static void verifyUser(String username, String password) throws LoginException {
		Map <String, User> allUsers;
		
		try {
			allUsers = getAll();
		} catch(SQLException ex) {
			throw new LoginException("Server Down. Kindly! try after sometime.");
		} catch(NullPointerException ex) {
			throw new LoginException("Server Down. Kindly! try after sometime.");
		}
			
		if(allUsers.containsKey(username)) {
			User verifiedUser = allUsers.get(username);
				
			if(verifiedUser.getPassword().equals(password)) {
						
			}
			else {
				throw new LoginException("Invalid password.");
			}
		}
		else {
			throw new LoginException("Username does not exist.");
		}
	}
	
	private static Map <String, User> getAll() throws SQLException, NullPointerException {
		Map <String, User> allUsers = new HashMap<>();
		
		try {
			Connection con = ConnectionUtil.getConnection();
			PreparedStatement ps = con.prepareStatement(SELECT_ALL);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				allUsers.put(rs.getString("username"), new User(rs.getString("username"), rs.getString("password")));
			}
				
			return allUsers;
		} catch(SQLException ex) {
			throw ex;
		} catch(NullPointerException ne) {
			throw ne;
		}
	}
}
