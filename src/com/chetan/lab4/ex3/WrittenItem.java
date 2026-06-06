package com.chetan.lab4.ex3;

import java.util.Objects;

public abstract class WrittenItem extends Item {

	private String author;
	
	public WrittenItem(int idNumber, String title, int numberOfCopies, String author) {
		super(idNumber, title, numberOfCopies);
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return super.toString() + ", Author=" + author;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		WrittenItem other = (WrittenItem) obj;
		return Objects.equals(author, other.author);
	}

}
