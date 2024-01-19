package collections;
class Name{
	public void NameMsg(String msg) {
		System.out.println("Sending a message: "+msg);
	
	try {
		Thread.sleep(200);
	}
	catch(Exception e) {
		System.out.println("Thread Interrupted");
	}
	System.out.println(msg+"  sent");
}
}
class Mm extends Thread{
	String msg;
	Name n;
	public Mm(String msg, Name n) {
		this.msg = msg;
		this.n = n;
	}
	public void run() {
		synchronized (n) {
			n.NameMsg(msg);
		}
	}
	
}
public class SynchronizedAnonymous {

	public static void main(String[] args) {
		Name n = new Name();
		Mm m1 = new Mm("Java", n);
		Mm m2 = new Mm("JavaTpoint", n);
		m1.start();
		m2.start();
		try {
			m1.join();
			m2.join();
		}
		catch(Exception e) {
			System.out.println("Interrupted");
		}
	}

}
