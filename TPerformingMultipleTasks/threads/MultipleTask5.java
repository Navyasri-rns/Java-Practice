
//Program of performing two tasks by two threads(anonymous class that implements Runnable interface)
package threads;

public class MultipleTask5 {
	public static void main(String[] args) {
	Runnable r = new Runnable() {
		public void run() {
			System.out.println("Task 1");
		}
	};
	Runnable s = new Runnable() {
		public void run() {
			System.out.println("Task 2");
		}
	};
	Thread t1 = new Thread(r);
	Thread t2 = new Thread(s);
	t1.start();
	t2.start();
	}

}
