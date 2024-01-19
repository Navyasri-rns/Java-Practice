package threads;

public class TShutdownHook1 {
	public static void main(String[] args) {
		Runtime a = Runtime.getRuntime();
		a.addShutdownHook(new Thread(){
		public void run() {
			System.out.println("Task completed");
		}
	}
		);
		System.out.println("Now main is sleeping...press ctrl+c to exit");
		try {
			Thread.sleep(2000);
		}
		catch(Exception e) {
			
		}
	}
}
