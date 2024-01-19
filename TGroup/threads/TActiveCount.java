package threads;

public class TActiveCount extends Thread{
	
	public TActiveCount(ThreadGroup group, String name) {
		super(group, name);	
	}
	public void run() {
		try {
			Thread.sleep(500);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		ThreadGroup tg = new ThreadGroup("Parent Thread");
		
		TActiveCount t = new TActiveCount(tg,"Navya");
		
		System.out.println("first thread");
		t.start();
		TActiveCount t1 = new TActiveCount(tg,"Anusha");
		System.out.println("second thread");
		t1.start();
		
		System.out.println("Total count of Threads: "+tg.activeCount());
	}
}
