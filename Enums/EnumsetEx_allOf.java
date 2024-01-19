import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

public class EnumsetEx_allOf {
	enum days{
		SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
	}
	public static void main(String[] args) {
		
		Set<days> s = EnumSet.allOf(days.class);
		System.out.println("Week Days: "+ s);
		
		Set<days> s1 = EnumSet.noneOf(days.class);
		System.out.println("(None of()) Week days: "+ s1);
		
	}

}
