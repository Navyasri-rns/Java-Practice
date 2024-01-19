package threads;

public class TPEx1 extends Thread{
	
	public static void main(String[] args) {
		Thread.currentThread().setPriority(8);
		System.out.println("Priority of main Thread is: "+Thread.currentThread().getPriority());
		TPEx1 t1 = new TPEx1();
		System.out.println("Priority of Thread t1 is: "+t1.getPriority());;
	}

}
