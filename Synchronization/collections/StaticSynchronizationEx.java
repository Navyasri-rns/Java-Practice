package collections;
class Aa{
	synchronized static void printTable(int n) {
		for(int i=0;i<=2;i++) {
			System.out.println(n*i);
		}
		try {
			Thread.sleep(300);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
class Bb extends Thread{
	public void run() {
		Aa.printTable(2);
	}
}
class Cc extends Thread{
	public void run() {
		Aa.printTable(4);
	}
}
public class StaticSynchronizationEx {

	public static void main(String[] args) {
		
		Bb a2 = new Bb();
		Cc a3 = new Cc();
		a2.start();
		a3.start();
	}

}
