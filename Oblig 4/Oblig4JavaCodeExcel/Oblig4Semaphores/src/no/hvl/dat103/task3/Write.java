package no.hvl.dat103.task3;

import java.util.concurrent.Semaphore;

public class Write implements Runnable{
	
	Semaphore writelock = new Semaphore(1);

	@Override
	public void run() {
		try {
			writelock.acquire();
			System.out.println("Thread " + Thread.currentThread().getName() + " is writing.");
			Thread.sleep(3000);
			System.out.println("Thread " + Thread.currentThread().getName() + " is done writing.");
			writelock.release();
		} catch (InterruptedException e) {
			System.out.println("Interruption catched.");			
		}
		
	}
}
