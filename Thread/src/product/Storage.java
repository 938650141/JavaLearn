package product;

class Storage {

	private Product[] products = new Product[10];
	private int top = 0;
	
	public synchronized void push(Product product) {
		while(top == products.length) {
			try {
				System.out.println("producter wait");
				wait();
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		products[top++] = product;
		System.out.println(Thread.currentThread().getName()+"生产了产品"+product);
		System.out.println("producer notifyAll");
		notifyAll();
	}
	
	public synchronized Product pop() {
		while(top == 0) {
			try {
				System.out.println("consumer wait");
				wait();
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		--top;
		Product p = new Product(products[top].getId(), products[top].getName());
		products[top]=null;
		System.out.println(Thread.currentThread().getName());
		System.out.println("comsumer notifyAll");
		notifyAll();
		return p;
	}

}
