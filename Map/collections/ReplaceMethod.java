package collections;

import java.util.HashMap;
import java.util.Map;

public class ReplaceMethod {

	public static void main(String[] args) {
		Map<Integer, Integer> a = new HashMap<>();
		a.put(1, 11);
		a.put(2, 22);
		a.put(3, 33);
		for(Map.Entry n:a.entrySet()) {
			System.out.println(n.getKey()+"  "+n.getValue());
		}
		a.replace(1, 12);
		System.out.println("After Invoking replace() Method");
		for(Map.Entry n:a.entrySet()) {
			System.out.println(n.getKey()+"  "+n.getValue());
		}
		a.replace(2, 22, 44);
		System.out.println("After Invoking replace() Method, Old value with new value ");
		for(Map.Entry n: a.entrySet()) {
			System.out.println(n.getKey()+"  "+n.getValue());
		}
		
		a.replaceAll((K,V)->100);
		System.out.println("After Invoking replaceAll method using lamda expression");
		System.out.println(a);
	}

}
