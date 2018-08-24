package com.impl;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.beans.Book;
import com.interfaces.BookIO;

public class Implementation1 implements BookIO {
	
		
	@Override
	public Book getBook() {
		// TODO Auto-generated method stub
		
		int isbn;
		String name;
		String publication;
		double price;
		
		Scanner s1= new Scanner(System.in);
		System.out.println("enter ISBN: ");
		isbn=s1.nextInt();
		System.out.println("enter Name of the book: ");
		name=s1.next();
		System.out.println("enter Publication ");
		publication=s1.next();
		System.out.println("enter price: ");
		price=s1.nextDouble();
		
		Book b1=new Book(isbn, name, publication, price);
		return b1;
	}

	@Override
	public void printBook(List<Book> books) {
		// TODO Auto-generated method stub
		Iterator<Book> it = books.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

	@Override
	public void printBook(Book book) {
		// TODO Auto-generated method stub
		
		System.out.println(book);
		
	}
	
}
