package com.chetan.lab4.ex3;

import java.util.Objects;

public abstract class Item {
	
	private int idNumber;
	private String title;
	private int numberOfCopies;
	
	public Item(int idNumber, String title, int numberOfCopies) {
		super();
		this.idNumber = idNumber;
		this.title = title;
		this.numberOfCopies = numberOfCopies;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumberOfCopies() {
		return numberOfCopies;
	}

	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}
	
//	public void print() {
//		System.out.println(this);
//	}
	
	public abstract void print();
	
	public void checkIn() {
		numberOfCopies++;
	}
	
	public void checkOut() {
		if(numberOfCopies > 0) {			
			numberOfCopies--;
		} else {
			System.out.println("No copies are available");
		}
	}
	
	public void addItem(int count) {
		numberOfCopies += count;
	}

	@Override
	public String toString() {
		return "idNumber=" + idNumber + ", title=" + title + ", NumberOfCopies=" + numberOfCopies;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return numberOfCopies == other.numberOfCopies && idNumber == other.idNumber
				&& Objects.equals(title, other.title);
	}
	
}
