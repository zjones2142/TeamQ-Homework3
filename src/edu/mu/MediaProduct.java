package edu.mu;

public class MediaProduct {
    public String title;
    public double price;
    public int year;
    public Genre genre;

    public enum Genre {
        ROCK,
        POP,
        JAZZ,
        CLASSICAL,
        HIP_HOP,
        ELECTRONIC,
        CHILDREN
    }
    
    public MediaProduct() {
        
    }

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
    
}