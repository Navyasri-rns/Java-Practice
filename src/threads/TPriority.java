package threads;
public class TPriority extends Thread{
	public void run() {
		System.out.println("Thread is executing....");
	}
	public static void main(String[] args) {
		TPriority t1 = new TPriority();
		TPriority t2 = new TPriority();
		TPriority t3 = new TPriority();
		System.out.println("Priority of the thread t1 is: "+t1.getPriority());
		System.out.println("Priority of the thread t2 is: "+t2.getPriority());
		System.out.println("Priority of the thread t3 is: "+t3.getPriority());
		t1.setPriority(10);
		t2.setPriority(NORM_PRIORITY);
		t3.setPriority(1);
		System.out.println("Priority of the thread t1 is: "+t1.getPriority());
		System.out.println("Priority of the thread t2 is: "+t2.getPriority());
		System.out.println("Priority of the thread t3 is: "+t3.getPriority());
		
		System.out.println("Currently Executing The Thread is: "+Thread.currentThread().getName());
		System.out.println("Priority of the thread is: "+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(10);
		System.out.println("Priority of the thread is: "+Thread.currentThread().getPriority());
	}

}

