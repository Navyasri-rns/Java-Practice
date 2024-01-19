package threads;

public class Ex1 extends Thread {
	public void run() {
		for(int i=0;i<=2;i++) {
		try {
				Thread.sleep(300);
			}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		Ex1 a = new Ex1();
		Ex1 b = new Ex1();
		Ex1 c = new Ex1();
		a.start();
		try {
			a.join(500);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		b.start();
		c.start();
	}

}
