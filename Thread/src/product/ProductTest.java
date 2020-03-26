package product;

public class ProductTest {

	public static void main(String[] args) throws InterruptedException {
		Storage storage = new Storage();
		
		Thread consumer1 = new Thread(new Consumer(storage));
		consumer1.setName("consumer1");
		Thread consumer2 = new Thread(new Consumer(storage));
		consumer2.setName("consumer2");
		Thread producer1 = new Thread(new Producer(storage));
		producer1.setName("producer1");
		Thread producer2 = new Thread(new Producer(storage));
		producer2.setName("Producer2");
		
		producer1.start();
		producer2.start();
		Thread.sleep(1000);
		consumer1.start();
		consumer2.start();
	}

}
