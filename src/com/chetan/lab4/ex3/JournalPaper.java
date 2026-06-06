package com.chetan.lab4.ex3;

public class JournalPaper extends WrittenItem {

	int yearPublished;

	public JournalPaper(int idNumber, String title, int numberOfCopies, String author, int yearPublished) {
		super(idNumber, title, numberOfCopies, author);
		this.yearPublished = yearPublished;
	}
	
	public int getYearPublished() {
		return yearPublished;
    }
	
	public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }
	
	@Override
	public void print() {
		System.out.println(this);
	}
	
	@Override
    public String toString() {
        return "Journal Paper -> " + super.toString() + ", Year Published=" + yearPublished;
    }
	
}
