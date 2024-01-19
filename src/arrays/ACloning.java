package arrays;

public class ACloning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {34,45,92,78};
		System.out.println("printing original array");
		for(int i:arr) {
			System.out.println(i);
		}
		
		System.out.println("printing cloning array");
		int carr[] = arr.clone();
		for(int i:carr) {
			System.out.println(i);
		}
	}

}
