package threads;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Tasks implements Runnable{
	String taskName;
	public Tasks(String taskName) {
		this.taskName = taskName;
	}
	public void run() {
		try {
			for(int i=0;i<5;i++) {
				if(i==0) {
					Date dt = new Date();
					SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss");
					System.out.println("Initialization "+taskName +" "+ s.format(dt));
				}
				else {
					Date dt = new Date();
					SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss");
					System.out.println("Time of execution "+taskName + " "+s.format(dt));
				}
			}
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}	
	}
}
public class TPool2 {
	static final int MaxTh = 3;
	public static void main(String[] args) {
		Runnable r1 = new Tasks("Tasks1");
		Runnable r2 = new Tasks("Tasks2");
		Runnable r3 = new Tasks("Tasks3");
		Runnable r4 = new Tasks("Tasks4");
		Runnable r5 = new Tasks("Tasks5");
		ExecutorService e = Executors.newFixedThreadPool(MaxTh);
		
		e.execute(r1);
		e.execute(r2);
		e.execute(r3);
		e.execute(r4);
		e.execute(r5);
		
		e.shutdown();
	}
	
}
