package threads;

public class TGarbageCollection {
	public void finalize() {
		System.out.println("Object is garbage collected");
	}
	public static void main(String[] args) {
		TGarbageCollection t1 =  new TGarbageCollection();
		TGarbageCollection t2 = new TGarbageCollection();
		t1 = null;
		t2 = null;
		System.gc();
	}

}
