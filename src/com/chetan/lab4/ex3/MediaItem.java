package com.chetan.lab4.ex3;

public abstract class MediaItem extends Item {
	
	private int runtime;

	public MediaItem(int idNumber, String title, int numberOfCopies, int runtime) {
		super(idNumber, title, numberOfCopies);
		this.runtime = runtime;
	}

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}
	
	@Override
    public String toString() {
        return super.toString() + ", Runtime=" + runtime + " mins";
    }
	
}
