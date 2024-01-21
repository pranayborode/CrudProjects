package com.test;

import java.util.Scanner;

import com.dao.BookDaoImpl;
import com.pojo.Book;

public class BookTest {

	public static void main(String[] args) {
	
		int bookid;
		String bookname;
		double bookprice;
		
		char ch;
		int choice;
		int books=0;
		Book book = null;
		
		Scanner sc = new Scanner(System.in);
		
		BookDaoImpl bdao = new BookDaoImpl();
		
		do {
			
			System.out.println("-----Book Library------");
			System.out.println("-----------------------------");
			System.out.println("1.Add Book");
			System.out.println("2.Update Book");
			System.out.println("3.Delete Book");
			System.out.println("4.Show Books");
			System.out.println("5.Search Book by Id");
			System.out.println("-----------------------------");

			System.out.println("Enter your Choice");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("---Add Book---");
				System.out.println("How Many Book You Want To add ?");
				books = sc.nextInt();
				
				for (int i = 1; i <= books; i++) {
					
					System.out.println("Enter Book Id:");
					bookid = sc.nextInt();
					System.out.println("Enter Book Name:");
					bookname = sc.next();
					System.out.println("Enter Book Price:");
					bookprice = sc.nextDouble();
					
					book = new Book(bookid, bookname, bookprice);
					bdao.addBook(book);
				}
				break;
				
			case 2:
				System.out.println("---Update Book---");
				System.out.println("Enter Book Id:");
				bookid = sc.nextInt();
				System.out.println("Enter Book Name:");
				bookname = sc.next();
				System.out.println("Enter Book Price:");
				bookprice = sc.nextDouble();
				
				book = new Book(bookid, bookname, bookprice);
				bdao.updateBook(book);
				break;
				
			case 3:
				System.out.println("---Delete Book---");
				System.out.println("Enter Book Id");
				bookid = sc.nextInt();
				
				bdao.deleteBook(bookid);
				break;
			case 4:
				if(books!=0) {
				bdao.showAllBook();
				}
				else {
					System.out.println("No Book Found");
				}
				break;
				
			case 5:
				System.out.println("Enter Book Id:");
				bookid=sc.nextInt();
				
				book=bdao.searchBookById(bookid);
				
				if(book!=null) {
					System.out.println(book);
				}
				else {
					System.out.println("Please Check Book Id");
				}
				break;
			}
			
			System.out.println("Do you want to continue?");
			ch = sc.next().charAt(0);
			
		} while (ch == 'y' || ch == 'Y');
	}

}
