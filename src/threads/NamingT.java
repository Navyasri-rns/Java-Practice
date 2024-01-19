package threads;

public class NamingT extends Thread{
	public void run() {
		System.out.println("Thread is running...");
	}
	public static void main(String[] args) {
			NamingT a = new NamingT();
			NamingT b = new NamingT();
			System.out.println("Name of a: "+a.getName());
			System.out.println("Name of b: "+b.getName());
			a.start();
			b.start();
			a.setName("Navya");
			System.out.println("After changing Name: "+a.getName());
	}

}
