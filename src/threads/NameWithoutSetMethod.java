package threads;
class Tname extends Thread{

	public Tname(String Name) {
		super(Name);
	}
	public void run() {
		System.out.println("Thread is executing....");
	}
	
}
public class NameWithoutSetMethod {
	public static void main(String[] args) {
	Tname a = new Tname("Navyasri");
	Tname b = new Tname("Anusha");
	System.out.println(a.getName());
	System.out.println(b.getName());
	a.start();
	b.start();
}
}