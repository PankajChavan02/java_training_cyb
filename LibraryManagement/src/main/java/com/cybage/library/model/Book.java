package com.cybage.library.model;

public class Book {
	private String bookName;
	private String author;
	private int pages;
	public Book(String bookName, String author, int pages) {
		super();
		this.bookName = bookName;
		this.author = author;
		this.pages = pages;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", author=" + author + ", pages=" + pages + "]";
	}
	
	

}
