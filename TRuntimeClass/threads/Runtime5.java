package threads;

public class Runtime5 {

	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		System.out.println("Total Memory: "+r.totalMemory());
		System.out.println("Free Memory: "+r.freeMemory());
		for(int i=0;i<5000;i++) {
			new Runtime5();
		}
		
		System.out.println("After creating 5000 instance,Free Memory: "+ r.freeMemory());
		System.gc();
		System.out.println("Atfer gc Memory: "+ r.freeMemory());
	}

}
