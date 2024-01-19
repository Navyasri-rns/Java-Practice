package threads;

public class TDaemon extends Thread{
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("Daemon Thread");
		}
		else {
				System.out.println("User defined Thread");
		}
	}
	public static void main(String[] args) {
		TDaemon t1 = new TDaemon();
		TDaemon t2 = new TDaemon();
		TDaemon t3 = new TDaemon();
		t1.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
	}

}
