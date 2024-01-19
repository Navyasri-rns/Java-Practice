package collections;
class Re{
	synchronized void PrintTable(int n) {
		for(int i=0;i<=2;i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(900);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}
class Th1 extends Thread{
	Re r;
	Th1(Re r){
		this.r = r;
	}
	public void run() {
		r.PrintTable(9);
	}
}
class Th2 extends Thread{
	Re r ;
	Th2(Re r){
		this.r =r;
	}
	public void run() {
		r.PrintTable(4);
	}
}
public class SynchronizedEx {

	public static void main(String[] args) {
		Re r1 = new Re();
		Th1 t1 = new Th1(r1);
		Th2 t2 = new Th2(r1);
		t1.start();
		t2.start();
	}

}
