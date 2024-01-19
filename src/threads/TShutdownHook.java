package threads;

public class TShutdownHook extends Thread{
	public void run() {
		System.out.println("Shut down Hook task Completed");
	}
	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		r.addShutdownHook(new TShutdownHook());
		
		System.out.println("Now main is sleeping ...press ctrl+c to exit");
		try {
			Thread.sleep(999);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
