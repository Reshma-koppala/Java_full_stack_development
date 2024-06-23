package com.pace.library.presentation;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.pace.library.entity.Book;
import com.pace.libray.service.BookServiceProvder;

public class BookUi {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Book book=new Book();
		ArrayList<Book>bookList=new ArrayList<Book>();
		BookServiceProvder bookServiceProvider=new BookServiceProvder();
		Scanner scnr=new Scanner(System.in);
		int choice;
		
		while(true) {
			System.out.println(
					"1.Add book details 2.show book details"
					+"3.Delete book 4.update book 5.exit\n");
			System.out.println("Enter your choice");
			choice=scnr.nextInt();
			scnr.nextLine();
			switch(choice) {
			case 1:
				book=null;
				book=new Book();
				System.out.println("Enter book id,book name,author,price");
				book.setId(scnr.nextInt());
				scnr.nextLine();
				book.setName(scnr.nextLine());
				book.setAuthor(scnr.nextLine());
				book.setPrice(scnr.nextFloat());
				scnr.nextLine();
				bookServiceProvider.insertBookService(book);
				break;
			case 2:
				//1.get books
				bookList=bookServiceProvider.getBookService();
				System.out.println("No.of rows in the table="+bookList);
				
				//2.show books
				bookServiceProvider.showBookService(bookList);
				break;
			case 3:
				System.out.println("Enter book id");
				int id=scnr.nextInt();
				scnr.nextLine();
				bookServiceProvider.deleteBookService(id);
				break;
			case 4:
				System.out.println("Enter book id");
				int bid=scnr.nextInt();
				scnr.nextLine();
				bookServiceProvider.updateBookService(bid);
				break;
			case 5:
				System.out.println("Thank you for using our application");
				System.exit(0);
				break;
			}
		}
	}

}
