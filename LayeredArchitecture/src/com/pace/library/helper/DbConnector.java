package com.pace.library.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnector {
	//New instance of connection
	private static Connection connection=null;
	
	//opening connection with mysql database
	public static Connection createConnection() throws ClassNotFoundException, SQLException {
		String url,userId,passWord;
		url="jdbc:mysql://localhost:3306/library";
		userId="root";
		passWord="Reshma@123";
		Class.forName("com.mysql.cj.jdbc.Driver");
	   return connection=DriverManager.getConnection(url,userId,passWord);
	}
	//closing connection
	public static void closeConnection() throws SQLException {
		connection.close();
	}

}
