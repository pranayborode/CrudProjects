package com.dao;

import com.pojo.Book;

public interface BookDao {

	void addBook(Book book);
	void updateBook(Book book);
	void deleteBook(int  bookid);
	void showAllBook();
	Book searchBookById(int bookid);
	
}
