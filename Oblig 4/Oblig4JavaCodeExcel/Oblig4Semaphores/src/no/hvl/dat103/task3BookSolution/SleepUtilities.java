package no.hvl.dat103.task3BookSolution;

public class SleepUtilities {
	private final static int napTime = 5;
	public static void nap() {
		nap(napTime);
	}
	
	public static void nap(int duration) {
		int sleeptime = (int) (napTime * Math.random());
		try {
			Thread.sleep(sleeptime*1000);
		} catch (InterruptedException e) {
			System.out.println("Nap is interrupted.");
		}
	}
}
