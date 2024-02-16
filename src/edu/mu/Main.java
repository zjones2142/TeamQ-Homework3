package edu.mu;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StockManagerSingleton stockmanager = new StockManagerSingleton();
		Boolean isinitalized = stockmanager.initializeStock();
		System.out.println(Boolean.toString(isinitalized));
		stockmanager.printListOfMediaProduct(stockmanager.inventory);
		
		
	}

}
