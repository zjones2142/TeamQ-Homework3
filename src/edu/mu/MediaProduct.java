package edu.mu;

public class MediaProduct {
	String title;
    double price;
    int year;
    enum genre {
    	ROCK,
    	POP,
    	JAZZ,
    	CLASSICAL,
    	HIP_HOP,
    	ELECTRONIC,
    	CHILDREN
    }

    public MediaProduct(String title, double price, int year, Genre genre) {
        this.title = title;
        this.price = price;
        this.year = year;
        this.genre = genre;
    }
    
}