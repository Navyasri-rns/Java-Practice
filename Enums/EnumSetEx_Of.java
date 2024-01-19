import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

public class EnumSetEx_Of {
	enum days{
		SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
	}
	public static void main(String[] args) {
		Set<days> s = EnumSet.of(days.SATURDAY,days.FRIDAY);
		Iterator<days> i = s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
