package threads;

public class TSetMaxPriority extends Thread{
	
	public TSetMaxPriority(ThreadGroup group, String name) {
		super(group, name);
		
	}

	public void run() {
		for(int i=0;i<2;i++) {
		try {
			Thread.sleep(10);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		}
		System.out.println(Thread.currentThread().getName()+"[Priority = "+ Thread.currentThread().getPriority()+"]");
		System.out.println(Thread.currentThread().getName()+ " finished executing");
		
	}
	public static void main(String[] args) throws Exception{
		ThreadGroup t = new ThreadGroup("Parent Thread");
		ThreadGroup t1 = new ThreadGroup(t, "child thread");
		t.setMaxPriority(Thread.MAX_PRIORITY);
		t1.setMaxPriority(Thread.MIN_PRIORITY);
		
		TSetMaxPriority a = new TSetMaxPriority(t, " One");
		a.setPriority(Thread.MAX_PRIORITY);
		System.out.println(a.getName()+" starts");
		a.start();
		
		TSetMaxPriority b = new TSetMaxPriority(t1, " Two");
		b.setPriority(Thread.MIN_PRIORITY);
		System.out.println(b.getName()+" starts");
		b.start();
		
		//toString() Method
		System.out.println("String equivalent: "+t.toString());
		System.out.println("String equivalent: "+ t1.toString());
	}

}
