package threads;

public class TShutdownHook2 {
 static class Msg extends Thread{
		public void run() {
			System.out.println("Bye");
		}
	}
	public static void main(String[] args) {
		Msg m = new Msg();
		Runtime.getRuntime().addShutdownHook(m);
		System.out.println("Program is starting");
		
		System.out.println("wait for 2 seconds");
		try {
			Thread.sleep(2000);
			Runtime.getRuntime().removeShutdownHook(m);
			System.out.println("Program is Terminating");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
