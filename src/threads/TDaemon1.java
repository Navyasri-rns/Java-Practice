package threads;

public class TDaemon1 extends Thread{
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("Daemon Thread");
		}
		else {
			System.out.println("User Defined thread");
		}
	}
	public static void main(String[] args) {
		TDaemon1 t1 = new TDaemon1();
		TDaemon1 t2 = new TDaemon1();
		TDaemon1 t3 = new TDaemon1();
		t1.start();
		t1.setDaemon(true);
		t2.start();
		t3.start();
	}

}
