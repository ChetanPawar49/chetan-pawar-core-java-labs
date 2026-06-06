package com.chetan.lab4.ex3;

public class Book extends WrittenItem {

	public Book(int idNumber, String title, int numberOfCopies, String author) {
		super(idNumber, title, numberOfCopies, author);
	}

	@Override
	public void print() {
		System.out.println(this);
	}
	
	@Override
	public String toString() {
		return "Book -> " + super.toString();
	}

}
