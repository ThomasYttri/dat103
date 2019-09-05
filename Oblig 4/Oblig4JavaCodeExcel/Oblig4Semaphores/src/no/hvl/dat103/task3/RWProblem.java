package no.hvl.dat103.task3;


public class RWProblem {
		
	public static void main (String[] args) {
		Read read = new Read();
		Write write = new Write();
		Thread first = new Thread(read);
		first.setName("Number one");
		Thread second = new Thread(read);
		second.setName("Number two");
		Thread third = new Thread(write);
		third.setName("Number three");
		Thread fourth = new Thread(write);
		fourth.setName("Number four");
		Thread fifth = new Thread(read);
		fifth.setName("Number five");
		Thread sixth = new Thread(write);
		sixth.setName("Number six");
		
		first.start();
		second.start();
		third.start();
		fourth.start();
		fifth.start();
		sixth.start();
		
	}
}
