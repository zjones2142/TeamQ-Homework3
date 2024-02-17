package edu.mu;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StockManagerSingleton stockmanager = new StockManagerSingleton();
		Genre r = Genre.ROCK;
		stockmanager.initializeStock();
		System.out.println("BEFORE ADD***********************");
		stockmanager.printListOfMediaProduct(stockmanager.inventory);
		MediaProduct p = new MediaProduct("Test", 0.00, 9999, r);
		stockmanager.addItem(p);
		stockmanager.saveStock();
		System.out.println("AFTER ADD************************");
		stockmanager.printListOfMediaProduct(stockmanager.inventory);
	}
}
