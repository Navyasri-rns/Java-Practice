package arrayPrograms;

public class FreqOfEachElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,2,2,3,1};
		int freq[] = new int[arr.length];
		int visited = -1;
		
		for(int i=0;i<arr.length;i++) {
			int count =1;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					freq[j]=visited;
				}
			}
			if(freq[i]!= visited) {
				freq[i]=count;
			}
		}
		System.out.println("------------------");
		System.out.println("Elements|Frequency");
		System.out.println("------------------");
		for(int i=0;i<freq.length;i++) {
			if(freq[i]!=visited) {
				System.out.println("   "+arr[i]+ "  |  "+ freq[i]);
			}
		}
		System.out.println("------------------");
	}

}
