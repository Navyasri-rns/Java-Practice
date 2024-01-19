
//IllegalArgumentException

package threads;

public class TPEx2Exception extends Thread{
	
	public static void main(String[] args) {
		Thread.currentThread().setPriority(17);
		System.out.println(Thread.currentThread().getPriority());

	}

}
