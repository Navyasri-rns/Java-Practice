
//Program of performing single task by multiple threads(Annonymous object)

package threads;

public class MultipleTask2 implements Runnable{

	public void run() {
		System.out.println("Task 1");	
	}
	public static void main(String[] args) {
		Thread t1 = new Thread(new MultipleTask2());
		Thread t2 = new Thread(new MultipleTask2());
		t1.start();
		t2.start();
	}

}

//Note: Each thread run in a separate callstack.