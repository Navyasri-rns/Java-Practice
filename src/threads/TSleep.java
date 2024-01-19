package threads;

public class TSleep extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e){
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
			TSleep t1 = new TSleep();
			TSleep t2 = new TSleep();
			t1.start();
			t2.start();
			

	}

}
