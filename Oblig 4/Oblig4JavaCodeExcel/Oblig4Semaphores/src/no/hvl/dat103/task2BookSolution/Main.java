package no.hvl.dat103.task2BookSolution;


 public class Main {
    public static void main(String args[]) {
      Buffer buffer = new BoundedBuffer();
   
      Thread producer = new Thread(new Producer(buffer));
      Thread consumer = new Thread(new Consumer(buffer));
   		
      producer.start();
      consumer.start();               
   }
}