
enum Level{
	LOW,
	MEDIUM,
	HIGH,
}
public class EnumEx1 {

	public static void main(String[] args) {
		Level a = Level.HIGH;
		
//		System.out.println(a);
		
//		switch(a) {
//		case LOW:
//			System.out.println("Low level");
//		case MEDIUM: 
//			System.out.println("Medium level");
//		case HIGH: 
//			System.out.println("High level");
//		}
		
		for(Level b: Level.values()) {
			System.out.println(b);
		}
	}

}
