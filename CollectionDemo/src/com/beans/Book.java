package com.beans;

public class Book implements Comparable<Book>{
	
	private int isbn;
	private String name;
	private String publication;
	private double price;
	
	public Book() {
		// TODO Auto-generated constructor stub
		super();
		isbn=12;
		name="Core Java";
		publication= "My Publication";
		price=123.50d;
	}
	
	public Book(int isbn) {
		// TODO Auto-generated constructor stub
		super();
		this.isbn=isbn;
		name=" ";
		publication= " ";
		price=0;
	}

	public Book(int isbn, String name, String publication, double price) {
		super();
		this.isbn = isbn;
		this.name = name;
		this.publication = publication;
		this.price = price;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", name=" + name + ", publication=" + publication + ", price=" + price + "]\n";
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		Book b = (Book)obj;
		return this.isbn==b.isbn;// && this.name.equals(b.name);
		
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		//return super.hashCode();
		return 10;
	}

	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		//return this.isbn-o.isbn;
		return this.name.compareTo(o.name);
		//return o.name.compareTo(this.name);
	}
	

}
