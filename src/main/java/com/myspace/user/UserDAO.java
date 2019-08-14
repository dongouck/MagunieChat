package com.myspace.user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpSession;

public class UserDAO {

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public UserDAO() {
		
		try {
			String dbURL 		= "jdbc:mysql://localhost:3306/test";
			String dbID			= "root";
			String dbPassword	= "root";
			
			Class.forName("com.mysql.jdbcDriver");
			
			conn	=	DriverManager.getConnection(dbURL, dbID, dbPassword);
			
		} catch (Exception e) {
			
			e.printStackTrace();	//어떤 오류인지 출력하는 부분
		}
	}
	public int login (String userId, String userPassword) {
		String aaa;
	
		return 1;
	}
	
}
