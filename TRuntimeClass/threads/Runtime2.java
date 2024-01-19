
//How to restart system in Java

package threads;

import java.io.IOException;

public class Runtime2 {

	public static void main(String[] args) {
		try {
			Runtime.getRuntime().exec("shutdown -r -t 5000");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
