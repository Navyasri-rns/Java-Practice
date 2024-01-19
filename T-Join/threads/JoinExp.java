package threads;
class ThreadJoin extends Thread{
	public void run() {
			try {
				for(int i=0;i<2;i++) {
				Thread.sleep(300);
				System.out.println(i);
				System.out.println("The  thread name is: "+Thread.currentThread().getName());
				}
			}
			catch(Exception e) {
				System.out.println("The exception has been caught "+e);
			}	
	}
}
public class JoinExp {

	public static void main(String[] args) {
		ThreadJoin t1 = new ThreadJoin();
		ThreadJoin t2 = new ThreadJoin();
		ThreadJoin t3 = new ThreadJoin();
		t1.start();
		try {
			System.out.println("The current thread name is: "+Thread.currentThread().getName());
			t1.join();
		}
		catch(Exception e) {
			System.out.println("The exception has been caught "+e);
		}
		t2.start();
		try {
			System.out.println("The current thread name is: "+Thread.currentThread().getName());
			t2.join();
		}
		catch(Exception e) {
			System.out.println("The exception has been caught "+e);
		}
		t3.start();
	}

}
