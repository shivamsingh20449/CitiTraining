package com.impl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.beans.Book;
import com.interfaces.BookOperations;

public class Implementation2 implements BookOperations {
	
	List<Book> books= new ArrayList<Book>();
	public Implementation2() {
		// TODO Auto-generated constructor stub
		Book book= new Book();
		books.add(book);
	}
	
	@Override
	public int addBook(Book book) {
		// TODO Auto-generated method stub
		this.books.add(book);
		return 0;
	}

	@Override
	public boolean deleteBook(Book book) {
		// TODO Auto-generated method stub
		boolean value= this.books.remove(book);
		return value;
	}

	@Override
	public Book findBook(Book book) {
		// TODO Auto-generated method stub
		Book b;
		boolean val= this.books.contains(book);
		
		if(val)
		{
			Iterator<Book> it = books.iterator();
			while(it.hasNext())
				if(it.next().equals(book))
				{
					b= it.next();
					System.out.println("value found");
					return b;
				}
		}
		else
		{
			System.out.println("book not found");
			return null;
		}
		
		return null;
			
	}

	@Override
	public List<Book> findBooksByName(String book_name) {
		// TODO Auto-generated method stub
		List<Book> newList= new ArrayList<Book>();
		
		Iterator<Book> it= newList.iterator();
		while(it.hasNext())
		{
			if(it.next().getName().equals(book_name))
			{
				newList.add(it.next());
			}
		}
		return newList;
	}

}
