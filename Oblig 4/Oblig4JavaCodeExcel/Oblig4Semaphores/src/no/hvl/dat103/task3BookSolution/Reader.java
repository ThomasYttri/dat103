package no.hvl.dat103.task3BookSolution;

public class Reader implements Runnable{
	private RWlock database;
	private int readerNum;
	
	public Reader(int readerNum, RWlock database) {
		this.readerNum = readerNum;
		this.database = database;
	}
	
	public void run() {
		while(true) {
			SleepUtilities.nap();
			System.out.println("Reader " + readerNum + " wants to read.");
			database.acquireReadLock(readerNum);	
			SleepUtilities.nap();
			database.releaseReadLock(readerNum);
		}
	}
}
