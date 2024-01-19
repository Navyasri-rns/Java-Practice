
//Program of performing single task by multiple threads

package threads;

public class MultipleTask1 extends Thread{
	public void run() {
		System.out.println("task one");
	}

	public static void main(String[] args) {
		MultipleTask1 t1 = new MultipleTask1();
		MultipleTask1 t2 = new MultipleTask1();
		MultipleTask1 t3 = new MultipleTask1();
		t1.start();
		t2.start();
		t3.start();

	}

}
