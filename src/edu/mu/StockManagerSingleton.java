package edu.mu;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StockManagerSingleton {
    private static StockManagerSingleton instance;
    private List<MediaProduct> inventory;
    private String inventoryFilePath = "inventory.csv"; // Path to your CSV file

    private StockManagerSingleton() {
        inventory = new ArrayList<>();
    }

    public static synchronized StockManagerSingleton getInstance() {
        if (instance == null) {
            instance = new StockManagerSingleton();
        }
        return instance;
    }

    public boolean initializeStock() {
        
    }

    public boolean updateItemPrice(MediaProduct product, double newPrice) {
        
    }

    public boolean addItem(MediaProduct product) {
        return inventory.add(product);
    }

    public boolean removeItem(MediaProduct product) {
        return inventory.remove(product);
    }

    public boolean saveStock() {
        
    }
    
    public ArrayList<MediaProduct> getMediaProductBelowPrice (int maxPrice) {
    	
    }
    
    public void printListOfMediaProduct(ArrayList<MediaProduct> productList) {
    	
    }
    
    public ArrayList<VinylRecordProduct> getVinylRecordList(ArrayList<MediaProduct> productList) {
    	
    }
    
    public ArrayList<CDRecordProduct> getCDRecordsList(ArrayList<MediaProduct> productList) {
    	
    }
    
    public ArrayList<TapeRecordProduct> getTapeRecordList(ArrayList<MediaProduct> productList) {
    	
    }
    
}