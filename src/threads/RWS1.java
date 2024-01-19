package threads;

public class RWS1 extends Thread{
	public void run() {
		
			for(int i=0;i<5;i++) {
				try {
					Thread.sleep(500);
			}
				catch(Exception e) {
					System.out.println(e);
				}
				System.out.println(i);
		}
	}

	public static void main(String[] args) {
		RWS1 r = new RWS1();
		RWS1 r1 = new RWS1();
		r.run();
		r1.run();
	}

}
