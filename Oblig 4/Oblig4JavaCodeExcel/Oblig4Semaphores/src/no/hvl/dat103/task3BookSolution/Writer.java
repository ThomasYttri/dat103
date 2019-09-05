package no.hvl.dat103.task3BookSolution;

public class Writer implements Runnable{
	
	private RWlock database;
	private int writerNum;
	
	public Writer(int writerNum, RWlock database) {
		this.writerNum = writerNum;
		this.database = database;
	}

	public void run() {
		while(true) {
			SleepUtilities.nap();
			
			System.out.println("Writer "+ writerNum + " wants to write.");
			
			SleepUtilities.nap();
			database.releaseWriteLock(writerNum);
		}	
	}
}
