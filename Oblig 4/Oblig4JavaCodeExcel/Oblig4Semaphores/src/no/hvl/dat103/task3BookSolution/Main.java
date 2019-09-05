package no.hvl.dat103.task3BookSolution;

public class Main {
	private static final int Num_of_readers = 5;
	private static final int Num_of_writers = 3;
	
	public static void main(String [] args) {
		RWlock database = new Database();
		
		Thread[] readerArray = new Thread[Num_of_readers];
		Thread[] writerArray = new Thread[Num_of_writers];
		
		for (int i = 0; i < Num_of_readers; i++) {
			readerArray[i] = new Thread(new Reader(i, database));
			readerArray[i].start();
		}
		
		for (int i = 0; i < Num_of_writers; i++) {
			writerArray[i] = new Thread(new Writer(i, database));
			writerArray[i].start();
		}
	}
}
