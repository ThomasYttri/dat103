package no.hvl.dat103.task2;

public class Consumer implements Runnable{
	private final Buffer buffer;
	
	public Consumer(Buffer buffer) {
		this.buffer = buffer;
		new Thread(this, "Consumer").start();
	}
	
	public void run() {
		for (int i = 0; i < 20; i++) {
			buffer.get();
			if(i == 19 ) {
				System.out.println("End of Program.");
			}
		}
			
	}
}
	

