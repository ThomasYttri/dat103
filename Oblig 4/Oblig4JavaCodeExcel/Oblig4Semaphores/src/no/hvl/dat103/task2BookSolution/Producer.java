package no.hvl.dat103.task2BookSolution;

import java.util.Date;

class Producer implements Runnable{
    
    private Buffer buffer;
           
     public Producer(Buffer b) {
       buffer = b;
    }
 
     public void run(){
       Date message;
       while (true) {
          System.out.println("Producer napping");
          SleepUtilities.nap();
          message = new Date();      
          System.out.println("Producer produced \"" + message + "\"");
          buffer.insert(message);
       }
    }
 }