
//Program of performing two tasks by two threads

package threads;
class A extends Thread{
	public void run() {
		System.out.println("Task 1");
	}
}
class B extends Thread{
	public void run() {
		System.out.println("Task 2");
	}
}
public class MultipleTask3 {
	public static void main(String[] args) {
		A t1 = new A();
		B t2 = new B();
		t1.start();
		t2.start();
	}
	

}
