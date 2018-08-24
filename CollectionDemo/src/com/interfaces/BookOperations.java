package com.interfaces;

import java.util.List;

import com.beans.Book;

public interface BookOperations {
	
	public int addBook(Book book);
	public boolean deleteBook(Book book);
	public Book findBook(Book book);
	public List<Book> findBooksByName(String book_name);

}
