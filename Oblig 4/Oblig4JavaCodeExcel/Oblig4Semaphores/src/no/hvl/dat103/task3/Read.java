package no.hvl.dat103.task3;

import java.util.concurrent.Semaphore;

public class Read implements Runnable{
	static Semaphore readlock = new Semaphore(1);
	static Semaphore writelock= new Semaphore(1);
	static int readCounter = 0;
	
	@Override
	public void run() {
		try {
			readlock.acquire();
			readCounter++;
			if (readCounter == 1) {
				writelock.acquire();
			}
			
			readlock.release();
			
			
			System.out.println("Thread " + Thread.currentThread().getName() + " is reading.");
			Thread.sleep(2000);
			System.out.println("Thread " + Thread.currentThread().getName() + " is done reading.");
			
			
			readlock.acquire();
			readCounter--;
			
			if(readCounter == 0) {
				writelock.release();
			}
		} catch (InterruptedException e){
			System.out.println("Interruption catched.");
		}
	}

}
