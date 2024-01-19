
public class Office{

	public static void main(String[] args) {
		Emp e = new Emp();
		try {
			e.navya();
			e.checkdep();
		}
		catch(SeatsException d) {
			d.printStackTrace();
		}
		catch(DomainsException d) {
			d.printStackTrace();
			d.getMessage();
		}
	}

	

}
