package edu.mu;

//import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StockManagerSingleton {
    private static StockManagerSingleton instance;
    private List<MediaProduct> inventory;
    public final String inventoryFilePath = "inventory.csv"; // Path to your CSV file

    
    
    
  //TODO rb - vvvvvvvvvvvvvv
    public StockManagerSingleton() {
        inventory = new ArrayList<>();
    }

    public static synchronized StockManagerSingleton getInstance() {
        if (instance == null) {
            instance = new StockManagerSingleton();
        }
        return instance;
    }

    public boolean initializeStock() {
    	return false;
    }
    
    
    
    
  //TODO jm - vvvvvvvvvvvvvv
    public boolean updateItemPrice(MediaProduct product, double newPrice) {
		return false;
        
    }

    public boolean addItem(MediaProduct product) {
        return inventory.add(product);
    }

    public boolean removeItem(MediaProduct product) {
        return inventory.remove(product);
    }
    
    
    
    //TODO zj - vvvvvvvvvvvvvv 
    public boolean saveStock() {
    	
		return false;
    }
    
    public ArrayList<MediaProduct> getMediaProductBelowPrice (int maxPrice) {
    	ArrayList<MediaProduct> temp = new ArrayList<MediaProduct>();
    	for(int i=0;i<inventory.size();i++) {
    		if(inventory.get(i).price < maxPrice) {
    			temp.add(i,inventory.get(i));
    		}
    	}
    	if(temp.size() == 0) {
    		System.out.println("No products at that price-point");
    		return null;
    	}
    	else {
    		return temp;
    	}
    }
    
    public void printListOfMediaProduct(ArrayList<MediaProduct> productList) {
    	for(int i=0;i<productList.size();i++) {
    		productList.get(i).printMediaProduct();
    	}
    }
    
    
    //TODO mj - vvvvvvvvvvvvvv
    public ArrayList<VinylRecordProduct> getVinylRecordList(ArrayList<MediaProduct> productList) {
		
    	//Creates ArrayList for VinylRecordProduct
    	ArrayList<VinylRecordProduct> vinylRecords = new ArrayList<>();
    	
    
    	for (MediaProduct mediaproduct : productList) {
    		
    		if(mediaproduct instanceof VinylRecordProduct) {
    			
    			VinylRecordProduct vinylproduct = (VinylRecordProduct) mediaproduct;
    			vinylRecords.add(vinylproduct);
    		}
    	}
    	//Returns the ArrayList vinylRecords
    	return vinylRecords;
    	
    }
    
    public ArrayList<CDRecordProduct> getCDRecordsList(ArrayList<MediaProduct> productList) {
		return null;
    	
    }
    
    public ArrayList<TapeRecordProduct> getTapeRecordList(ArrayList<MediaProduct> productList) {
		return null;
    	
    }
}