package TypesOfExceptions;
class EArithemetic{
	public static void main(String[] args) throws Exception {
		try {
			int a = 50/0;
		}
		catch(Exception e) {
			System.out.println(e);
		}
//		try {
//		String s=null;
//		System.out.println(s.length());
//		}
//		
//		catch(NullPointerException e) {
//			//System.out.println("NullPointer"+e.getMessage());
//			throw new Exception("Hi.");
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
		
		//System.out.println("rest of the code");
	}
}