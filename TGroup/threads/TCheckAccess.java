package threads;

public class TCheckAccess extends Thread{
	
	public TCheckAccess(ThreadGroup group, String name) {
		super(group, name);
		
	}

	public void run() {
		try {
			Thread.sleep(999);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		System.out.println(Thread.currentThread().getName()+ " completed executing");
	} 
	public static void main(String[] args) {
		ThreadGroup t = new ThreadGroup("Parent Thread");
		ThreadGroup t1 = new ThreadGroup(t,"Child Thread");
		
		TCheckAccess a = new TCheckAccess(t, "one");
		System.out.println("first");
		a.start();
		a.suspend(); //suspend method
		TCheckAccess b = new TCheckAccess(t, "two");
		System.out.println("second");
		b.start();
		b.resume(); //resume method
//		t.checkAccess();
//		System.out.println(t.getName()+ " has Access");
//		
//		t1.checkAccess();
//		System.out.println(t1.getName()+" has Access");
		
		// checking who is parent thread  (ThreadGroup parentOf() method)
//		boolean isParent = t1.parentOf(t);
//		System.out.println(t1.getName()+" is Parent of "+ t.getName()+" : "+ isParent);
//		
//		isParent = t.parentOf(t1);
//		System.out.println(t.getName()+" is Parent of "+ t1.getName()+" : "+ isParent);
		
		
	}
}
