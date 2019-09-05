package no.hvl.dat103.task2;

public class BoundedBuffer {
	public static void main(String[] args) {
		System.out.println("Start of program: ");
		
		Buffer buffer = new Buffer();
		
		new Consumer(buffer);
		new Producer(buffer);

		
	}
}
