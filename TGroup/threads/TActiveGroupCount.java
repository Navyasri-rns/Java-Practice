package threads;

public class TActiveGroupCount extends Thread{
	public TActiveGroupCount(ThreadGroup group, String name) {
		super(group, name);
		
	}
	public void run() {
		try {
			Thread.sleep(500);
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		System.out.println(Thread.currentThread().getName()+ " Thread has finished executing");
	}
	public static void main(String[] args) {
		ThreadGroup tg = new ThreadGroup("Parent Thread");
		ThreadGroup tg1 = new ThreadGroup(tg, "Child Thread");
		
		TActiveGroupCount t1 = new TActiveGroupCount(tg, "Navya");
		System.out.println("first");
		t1.start();
		TActiveGroupCount t2 = new TActiveGroupCount(tg, "Anusha");
		System.out.println("second");
		t2.start();
		
		System.out.println("Thread Group Name: "+ tg.activeGroupCount());
}
}