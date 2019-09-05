package no.hvl.dat103.task2;
import java.util.concurrent.Semaphore;

public class Buffer {

	int item; 
	
	private static Semaphore consumer = new Semaphore(0);
	private static Semaphore producer = new Semaphore(1);
	
	public void get () {
		try {
			consumer.acquire();
		} catch (InterruptedException e) {
			System.out.println("Interruption caught");
		}
		
		System.out.println("Consumer bought item: " + item);
		
		producer.release();
	}
	
	public void put(int item) {
		try {
			producer.acquire();
		} catch (InterruptedException e) {
			System.out.println("Interrupted caught");
		}
		
		this.item = item;
		
		System.out.println("Producer made item: " + item);
		
		consumer.release();
	}
	
	
}
