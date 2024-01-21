package com.dao;

import com.pojo.Book;

public class BookDaoImpl implements BookDao {

	int index;
	Book book;
	Book bookarr[];

	public BookDaoImpl() {
		bookarr = new Book[10];
		index = 0;
	}

	@Override
	public void addBook(Book book) {

		bookarr[index] = book;
		index++;
	}

	@Override
	public void updateBook(Book book1) {

		book = searchBookById(book1.getBookid());
		
		if(book !=null) {
			
			System.out.println("Book is present");
			
			for (int i = 0; i < index; i++) {
				
				if (book1.getBookid() == bookarr[i].getBookid()) {
					
					bookarr[i] = book1;
					System.out.println("Book Updated");
					break;
				}
			}
		}
	}

	@Override
	public void deleteBook(int bookid) {

		book = searchBookById(bookid);

		if (book != null) {
			
			System.out.println("Book is Present");

			for (int i = 0; i < index; i++) {
				
				if (bookid == bookarr[i].getBookid()) {
					
					bookarr[i] = null;
					System.out.println("Book is removed");
					break;
				}
			}
		} else {
			System.out.println("Book is not present(invalid id)");

		}
	}

	@Override
	public void showAllBook() {

		for (int i = 0; i < index; i++) {
			if(bookarr[i] !=null) {
				System.out.println(bookarr[i]);	
			}	
		}
	}

	@Override
	public Book searchBookById(int bookid) {

		Book b = null;
		for (int i = 0; i < index; i++) {
			if (bookarr[i].getBookid() == bookid) {
				b = bookarr[i];

				break;
			}
		}
		return b;

	}

}
