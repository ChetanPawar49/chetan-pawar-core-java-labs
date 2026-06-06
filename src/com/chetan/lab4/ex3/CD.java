package com.chetan.lab4.ex3;

public class CD extends MediaItem {

	private String artist;
	private String genre;
	
	public CD(int idNumber, String title, int numberOfCopies, int runtime, String artist, String genre) {
		super(idNumber, title, numberOfCopies, runtime);
		this.artist = artist;
		this.genre = genre;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public void print() {
		System.out.println(this);
	}
	
	@Override
    public String toString() {
        return "CD -> " + super.toString() + ", Artist=" + artist + ", Genre=" + genre;
    }

}
