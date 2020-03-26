package product;

import java.util.Random;

class Producer implements Runnable {
	private Storage storage;
	
	public Producer(Storage storage) {
		this.storage = storage;
	}
	
	public void run() {
		Random r = new Random();
		int i = 0;
		while(i < 10) {
			i++;
			Product product = new Product(i, "µç»°"+r.nextInt(100));
			storage.push(product);
		}
	}
}
