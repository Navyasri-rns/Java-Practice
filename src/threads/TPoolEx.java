package threads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Worker implements Runnable{
	String message;
	public Worker(String message) {
		this.message = message;
	}
	public void run() {
		System.out.println(Thread.currentThread().getName()+ " (Start) "+ message);
		processmsg();
		System.out.println(Thread.currentThread().getName()+" (End) ");
	}
	void processmsg() {
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public class TPoolEx {
	public static void main(String[] args) {
	ExecutorService e = Executors.newFixedThreadPool(5);
	for(int i=1;i<10;i++) {
		Runnable r = new Worker(""+ i);
		e.execute(r);
	}
	e.shutdown();
	while(!e.isTerminated()) {
		
	}
	System.out.println("Finished all Threads...");
}
}