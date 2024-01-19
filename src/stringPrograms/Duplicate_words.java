package stringPrograms;

import java.util.ArrayList;

public class Duplicate_words{

	public static void main(String[] args) {
		String s = "Java is a Programming  chandu Langauge, Java is a Programming Langauge";
		
		String[] a = s.split(" ");
		
		ArrayList<String> li = new ArrayList<>();
		//ArrayList<String> li1 = new ArrayList<>();
		
		int count=1;
		for(int i=0; i<a.length; i++) {
			count = 1;
			if(li.contains(a[i])) {
				continue;
			}
			li.add(a[i]);
			for(int j=i+1; j<a.length; j++) {
				if(a[i].equals(a[j])) {
					count++;
				}
			}
			if(count>1){
				//li1.add(a[i]);
			
			System.out.println(a[i]+" has repeated "+count+" number of times.");}
			}
	}

}
