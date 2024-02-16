package edu.mu;

import java.io.*;
import java.util.ArrayList;

public class StockManagerSingleton {
    private static StockManagerSingleton instance;
    public ArrayList<MediaProduct> inventory;
    public final String inventoryFilePath = "inventory.csv"; // Path to your CSV file
    public final String path2 = "inventoryCopy.csv";
    
    
    
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
    	try(BufferedReader br = new BufferedReader(new FileReader(inventoryFilePath))){
    		String line;
    		while((line = br.readLine()) != null) //iterate through all lines in the file
    		{ 
	          if(line.startsWith("Type")) { //skips headers
	            continue;
	          }
	          
	          String[] data = line.split(",");
	          String type = data[0];
	          String title = data[1];
	          double price = Double.parseDouble(data[2]);
	          int year = Integer.parseInt(data[3]);
	          Genre genre = Genre.valueOf(data[4]);
	
	          MediaProduct product = null;
	
	          switch(type) {
	            case "CD":
	                    product = new CDRecordProduct(title, price, year, genre);
	                    break;
	                case "Vinyl":
	                    product = new VinylRecordProduct(title, price, year, genre);
	                    break;
	                case "Tape":
	                    product = new TapeRecordProduct(title, price, year, genre);
	                    break;
	                default:
	                    break;
	          }
	
	          if(product != null) {
	            inventory.add(product);
	          }
	        }
	        return true;
	      } catch (IOException e) {
	    	  e.printStackTrace();
	        return false;
	      }
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
    	try(BufferedWriter bw = new BufferedWriter(new FileWriter(path2))) {
    		//string constructor
			String[] str = {""};
    		for(int i=0;i<inventory.size();i++) {
    			str[i] = inventory.get(i).getTitle()+","
    					+Double.toString(inventory.get(i).getPrice())+","
    					+Integer.toString(inventory.get(i).getYear())+","
    					+Genre.toString(inventory.get(i).getGenre());
    		}
    		//file writing
    		bw.write("Type,Title,Price,Year,Genre"+System.getProperty("line.separator"));
    		for(int i=0;i<inventory.size();i++) {
    			if(inventory.get(i) instanceof CDRecordProduct) {
    				bw.write("CD,"+str[i]+System.getProperty("line.separator"));
    			}
    			else if (inventory.get(i) instanceof TapeRecordProduct) {
    				bw.write("Tape,"+str[i]+System.getProperty("line.separator"));
    			}
    			else if (inventory.get(i) instanceof VinylRecordProduct) {
    				bw.write("Vinyl,"+str[i]+System.getProperty("line.separator"));
    			}
    		}
    		bw.close();
    		return true;
    	} catch(IOException e) {
    		e.printStackTrace();
    		return false;
    	}
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