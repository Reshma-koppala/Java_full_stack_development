package com.pace.library.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.pace.library.entity.Book;
import com.pace.library.helper.DbConnector;

//persistence layer
public class BookDao {
	//JDBC API classes for data retrival
	private Connection connection=null;
	private PreparedStatement pstatement=null;
	private ResultSet resultSet=null;
	//Book book=new Book()
	ArrayList<Book> bookList=null;
	private static String bookQry="select * from book";
	/*************Get books data******************/
	public ArrayList<Book> getBooks() throws ClassNotFoundException, SQLException{
		//process to get books from table into bookList
		//1.Get the book data from table
		//2.Add each book to BookList
		//3.Return the booklist
		try {
			//open the connection
			connection=DbConnector.createConnection();
			//create pstatement
			pstatement=connection.prepareStatement(bookQry);
			//get the result 
			resultSet=pstatement.executeQuery();
			Book book;
			bookList=new ArrayList<Book>();
			while(resultSet.next()) {
				int id;
				String name;
				String author;
				float price;
				//declare the pojo
				
				book=new Book();
				//get the row details
				id=resultSet.getInt(1);
				name=resultSet.getString(2);
				author=resultSet.getString(3);
				price=resultSet.getFloat(4);
				//Add this data to book bean
				//set the pojo with retrived values from the row
				book.setId(id);
				book.setName(name);
				book.setAuthor(author);
				book.setPrice(price);
				//Add the book to bookList
				bookList.add(book);
				book=null;
				}//end the while loop
		}catch(SQLException sqlex) {
			
		}finally {
			//close connection
			//now data is in array list object. close the connection
			DbConnector.closeConnection();
		}
		return bookList;
	}
	
	/****************show list of books******************/
	public void showBookList(ArrayList<Book>bookList2) {
		System.out.println("In DAO Layer");
		for(Book book:bookList2) {
			System.out.println(book.getId());
			System.out.println("\t"+book.getName());
			System.out.println("\t"+book.getAuthor());
			System.out.println("\t"+book.getPrice());
		}
	}
	
	/*************Inserting book data*************************/
	public void insertBookDetails(Book book) throws ClassNotFoundException, SQLException {
		connection=DbConnector.createConnection();
		String insQry="insert into book values(?,?,?,?)";
		pstatement=connection.prepareStatement(insQry);
		pstatement.setInt(1, book.getId());
		pstatement.setString(2, book.getName());
		pstatement.setString(3, book.getAuthor());
		pstatement.setFloat(4,book.getPrice());
		
		int rows=pstatement.executeUpdate();
		System.out.println(rows+"Rows Inserted");
		DbConnector.closeConnection();
	}
	
	/*************Deleting book *******************/
	public boolean deleteBook(int id) throws ClassNotFoundException, SQLException {
		pstatement=null;
		//Scanner scnr=new Scanner(System.in);
		connection=DbConnector.createConnection();
		String delQry="delete from book where id=?";
		pstatement=connection.prepareStatement(delQry);
		pstatement.setInt(1,id);
		int rows=pstatement.executeUpdate();
		boolean isDelete=true;
		if(rows!=0) {//if rows is non zero.It is deleted
			isDelete=true;
		}else {
			isDelete=false;//status of deletion
		}
		DbConnector.closeConnection();
		return isDelete;
	}
		/************Updating book ***************/
		public boolean updateBook(int id) throws ClassNotFoundException, SQLException {
			pstatement=null;
			connection=DbConnector.createConnection();
			String updQry="update book set price=price*0.10 where id=? ";
			pstatement=null;
			pstatement=connection.prepareStatement(updQry);
			pstatement.setInt(1, id);
			int rows=pstatement.executeUpdate();
			boolean isUpdate=true;
			if(rows!=0) {
				isUpdate=true;
			}else {
				isUpdate=false;
			}
			DbConnector.closeConnection();
			return isUpdate;
		}
		
	}//end of dao class
	


