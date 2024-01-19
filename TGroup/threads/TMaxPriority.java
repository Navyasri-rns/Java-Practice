package threads;

public class TMaxPriority extends Thread{
	
	public TMaxPriority(ThreadGroup group, String name) {
		super(group, name);
		
	}

	public void run() {
		try {
			Thread.sleep(599);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		System.out.println(Thread.currentThread().getName()+ " Finished executing");
	}
	public static void main(String[] args) {
		ThreadGroup t = new ThreadGroup("Parent thread");
		ThreadGroup t1 = new ThreadGroup(t,"Child Thread");
		
		TMaxPriority a = new TMaxPriority(t,"one");
		System.out.println("First");
		a.start();
		TMaxPriority b = new TMaxPriority(t,"two");
		System.out.println("second");
		b.start();
		
//		System.out.println("Maximum priority of Parent Thread: "+t.getMaxPriority());
//		System.out.println("The ParentThread Group for: "+t.getName()+" is "+ t.getParent().getName());
//		System.out.println("The ParentThread Group for: "+ t1.getName()+" is "+t1.getParent().getName());
//		
//		t.interrupt();
		
//		if(t.isDaemon()==true) {
//			System.out.println("Is Daemon");
//		}
//		else {
//			System.out.println("Not Daemon");
//		}
		if(t.isDestroyed()==true) {
			System.out.println("The Thread is Destroyed");
		}
		else {
			System.out.println("The Thread is not Destroyed");
		}
	}
}
	
	
