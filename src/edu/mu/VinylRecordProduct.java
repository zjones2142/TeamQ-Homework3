package edu.mu;

public class VinylRecordProduct extends MediaProduct {

    public VinylRecordProduct(String title, double price, int year, Genre genre) {
        super(title, price, year, genre);
    }

    public VinylRecordProduct(VinylRecordProduct other) {
        super(other.title, other.price, other.year, other.genre);
    }
}