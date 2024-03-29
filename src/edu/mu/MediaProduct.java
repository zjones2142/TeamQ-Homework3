package edu.mu;

public class MediaProduct {
    public String title;
    public double price;
    public int year;
    public Genre genre;

    public MediaProduct(String title, double price, int year, Genre genre) {
        this.title = title;
        this.price = price;
        this.year = year;
        this.genre = genre;
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
	
	public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }
    
    public void printMediaProduct() {
    	System.out.println("  Title: "+this.getTitle()+
    			"\n  Price: $"+this.getPrice()+
    			"\n  Year: "+this.getYear()+
    			"\n  Genre: "+this.getGenre()+"\n");
    }
}