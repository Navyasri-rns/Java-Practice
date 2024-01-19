package threads;

public class TDestroy extends Thread{
	
	public TDestroy(ThreadGroup group, String name) {
		super(group, name);
		
	}
	public void run() {
		try {
			Thread.sleep(999);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		System.out.println(Thread.currentThread().getName()+" Thread has finished executing");
	}
	public static void main(String[] args) throws InterruptedException {
		ThreadGroup a = new ThreadGroup("Parent Thread...");
		ThreadGroup a1 = new ThreadGroup(a,"Child Thread...");
		
		TDestroy t1 = new TDestroy(a,"Thread 1-");
		System.out.println("Starting the first");
		t1.start();
		TDestroy t2 = new TDestroy(a,"Thread 2-");
		System.out.println("Starting the second");
		t2.start();
		
		t1.join();
		t2.join();
		
		a.destroy();
		System.out.println(a.getName()+ " is Destroyed");
		
	}

}
