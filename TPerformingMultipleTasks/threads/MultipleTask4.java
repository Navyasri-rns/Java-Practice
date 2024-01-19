
//Program of performing two tasks by two threads(anonymous class that extends Thread class)
package threads;

public class MultipleTask4 {
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				System.out.println("Task 1");
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				System.out.println("Task 2");
			}
		};
		
		t1.start();
		t2.start();
	}

}
