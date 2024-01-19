package threads;

public class RunWithoutStart extends Thread{
	public void run() {
		System.out.println("Thread is running...");
	}

	public static void main(String[] args) {
		RunWithoutStart r = new RunWithoutStart();
		r.run();//fine, but does not start a separate call stack 
	}

}
