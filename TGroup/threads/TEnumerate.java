package threads;

public class TEnumerate extends Thread{
	
	public TEnumerate(ThreadGroup group, String name) {
		super(group, name);		
	}
	public void run() {
		try {
			Thread.sleep(499);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		System.out.println(Thread.currentThread().getName()+ " finished executing");
	}
	public static void main(String[] args) {
		ThreadGroup t = new ThreadGroup("Parent Thread..");
		ThreadGroup t1 = new ThreadGroup(t,"Child Thread...");
		
		TEnumerate a = new TEnumerate(t,"Thread1");
		System.out.println("Thread 1");
		a.start();
		TEnumerate b = new TEnumerate(t,"Thread2");
		System.out.println("Thread 2");
		b.start();
		
		Thread[] arr = new Thread[t.activeCount()];
		int c = t.enumerate(arr);
		for(int i=0;i<c;i++) {
			System.out.println(arr[i].getName() +" is found");
		}
	}
}
