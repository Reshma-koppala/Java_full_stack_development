package com.pace.libray.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.pace.library.dao.BookDao;
import com.pace.library.entity.Book;

public class BookServiceProvder {
	ArrayList<Book> bookList=new ArrayList<Book>();
	BookDao bookDAO=new BookDao();
	
	//reading book data service
	public ArrayList<Book>getBookService() throws ClassNotFoundException, SQLException{
		bookList=bookDAO.getBooks();
		return bookList;
	}
	//showing book data service
	public void showBookService(ArrayList<Book>bookList) throws ClassNotFoundException, SQLException {
		System.out.println("In service layer");
		bookList=bookDAO.getBooks();
		bookDAO.showBookList(bookList);
	}
	//insert book data service
	public void insertBookService(Book book) throws ClassNotFoundException, SQLException {
		bookDAO.insertBookDetails(book);
	}
	//deleting book data service
	public void deleteBookService(int id) throws ClassNotFoundException, SQLException {
		boolean isBookDeleted=bookDAO.deleteBook(id);
		if(isBookDeleted==true) {
			System.out.println("Book with id "+ id +" was deleted");
		}else {
			System.out.println("Book with id "+ id +" is unavailable");
		}
	}
	//updating book data service
	public void updateBookService(int id) throws ClassNotFoundException, SQLException {
		boolean isBookUpdated=bookDAO.updateBook(id);
		if(isBookUpdated==true) {
			System.out.println("Book with id"+ id +"was updated");
		}else {
			System.out.println("Book with id"+ id +"is unavailable");
		}
		}
	}
