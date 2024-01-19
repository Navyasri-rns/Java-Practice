package threads;

import java.util.ArrayList;

public class Exmpl {
	public static void main(String[] args) {
		String s = "Java is a programming language , Java is a high level language ";
		
		String[] arr = s.split(" ");
		
		ArrayList<String> li = new ArrayList<>();
		int count =1;
		
		for(int i=0;i<arr.length;i++) {
			count =1;
			if(li.contains(arr[i])) {
				continue;
			}
			li.add(arr[i]);
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].equals(arr[j])) {
					count++;
				}
			}
			if(count>1) {
				System.out.println(arr[i]+ " repeated "+ count+" times");
			}
		}
	}

}
