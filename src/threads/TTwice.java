package threads;

public class TTwice extends Thread {
	public void run() {
		System.out.println("Thread is running...");
	}

	public static void main(String[] args) {
			TTwice t = new TTwice();
			t.start();
			t.start();
	}

}
