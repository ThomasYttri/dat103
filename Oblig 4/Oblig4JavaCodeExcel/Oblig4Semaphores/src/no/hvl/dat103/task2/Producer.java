package no.hvl.dat103.task2;


public class Producer implements Runnable{
	private final Buffer buffer;
	
	int buffer_size = 0;
	boolean isFull = false;
	
	public Producer(Buffer buffer) {
		this.buffer = buffer;
		new Thread(this, "Producer").start();
	}
	
	public void run() {
		for (int i=0; i < 20; i++) {
			buffer.put(i);
		}
	}
}
