package threads;
//How to shutdown system in Java

public class Runtime3{  
	 public static void main(String args[])throws Exception{  
	  Runtime.getRuntime().exec("shutdown -s -t 0");  
	 }  
	}  