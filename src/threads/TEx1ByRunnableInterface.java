package threads;

public class TEx1ByRunnableInterface implements Runnable {
	public void run() {
		System.out.println("Thread is running...");
	}
	public static void main(String[] args) {
		TEx1ByRunnableInterface t = new TEx1ByRunnableInterface();
		Thread t1 = new Thread(t);
		t1.start();
	}
}
