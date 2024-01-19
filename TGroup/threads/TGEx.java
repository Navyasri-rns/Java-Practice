package threads;

public class TGEx implements Runnable{

	public static void main(String[] args) {
		TGEx t = new TGEx();
		ThreadGroup t1 = new ThreadGroup("Parent Thread");
		Thread s1 = new Thread(t1, t,"one");
		s1.start();
		Thread s2 = new Thread(t1, t,"two");
		s2.start();
		Thread s3 = new Thread(t1, t,"three");
		s3.start();
		
		System.out.println("Thread Group name: "+ t1.getName());
		t1.list();
		
	}

	
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

}
