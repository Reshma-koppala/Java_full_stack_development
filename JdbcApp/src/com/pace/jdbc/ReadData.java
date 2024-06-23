package com.pace.jdbc;
import java.sql.*;
import java.sql.Statement;
import java.util.Scanner;


public class ReadData {
	Connection conn;
	Statement stmt;
	ResultSet rset;
	Scanner sc=new Scanner(System.in);
	public void registerDriver()throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
	}
	public void getDetails() throws SQLException {
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","Reshma@123");
		//Statement stmt=conn.createStatement();
		PreparedStatement pstmt;
		
		int id;
		String name,author;
		float price;
		System.out.println("Insert book id");
		id=sc.nextInt();
		System.out.println("Insert book name");
		name=sc.next();
		System.out.println("Insert book author");
		author=sc.next();
		System.out.println("Insert book price");
		price=sc.nextFloat();
		pstmt=conn.prepareStatement("insert into book values(?,?,?,?)");
		pstmt.setInt(1,id);
		pstmt.setString(2, name);
		pstmt.setString(3, author);
		pstmt.setFloat(4, price);
		int row1=pstmt.executeUpdate("insert into book values("+id+",'"+name+"','"+author+"',"+price+")");
		rset=pstmt.executeQuery("select * from book");
		while(rset.next()) {
			System.out.println(rset.getInt(1)+" "+rset.getString(2)+" "+rset.getString(3)+" "+rset.getFloat(4));
		}
		pstmt.executeUpdate();
		rset.close();
		pstmt.close();
		conn.close();
	}
	

}
