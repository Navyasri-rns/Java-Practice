package threads;

public class TS2 extends Thread {
	public void run() {
		try {
		for(int j=0;j<5;j++) {
				Thread.sleep(-100);
				System.out.println(j);
			}
		}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	
	public static void main(String[] args) {
		TS2 s = new TS2();
		s.start();
	}

}
