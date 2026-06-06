package com.chetan.lab4.ex3;

public class Video extends MediaItem {
	
	private String director;
	private String genre;
	private int yearReleased;

	public Video(int idNumber, String title, int numberOfCopies, int runtime, String director, String genre, int yearReleased) {
		super(idNumber, title, numberOfCopies, runtime);
		this.director = director;
		this.genre = genre;
		this.yearReleased = yearReleased;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getYearReleased() {
		return yearReleased;
	}

	public void setYearReleased(int yearReleased) {
		this.yearReleased = yearReleased;
	}

	@Override
	public void print() {
		System.out.println(this);
	}
	
	@Override
    public String toString() {

        return "Video -> " + super.toString() + ", Director=" + director + ", Genre=" + genre + ", Year Released=" + yearReleased;
    }

}
