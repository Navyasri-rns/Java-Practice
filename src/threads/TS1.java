package threads;

public class TS1 extends Thread {
	public void run() {
		try {
		for(int j=0;j<5;j++) {
			Thread.sleep(5000);
			System.out.println(j);
		}
	    } 
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		TS1 t = new TS1();
		t.start();
	}

}
