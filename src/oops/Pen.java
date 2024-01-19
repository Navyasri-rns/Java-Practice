package oops;

public class Pen {
	public static void main(String[] args) {
		Properties p= new Properties();
		System.out.println(p.type);
		System.out.println(p.colour);
		System.out.println(p.price);
		
		System.out.println(p.clicked);
		p.click();
		System.out.println(p.clicked);
	}
}
class Properties{
String type = "gel";
String colour = "Blue";
int price = 10;

static boolean clicked = false;
public static void click() {
	clicked = true;
}
public static void unclicked() {
	clicked = false;
}
}