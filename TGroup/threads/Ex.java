package threads;

public class Ex implements Runnable{
	public void run() {
		try {
			Thread.sleep(500);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		Runnable e = new Ex();
		ThreadGroup t = new ThreadGroup("Parent thread");
		Thread a = new Thread(t,e,"Thread 1");
		System.out.println("Thread-1");
		a.start();
		Thread b = new Thread(t,e,"Thread 2");
		System.out.println("Thread-2");
		b.start();
		
		System.out.println("active count: "+t.activeCount());
		
		
	}

}
