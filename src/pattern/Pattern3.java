package pattern;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int rows=6;
    for(int i=rows-1; i>=1; i--)
    {
    	for(int j=1; j<=i; j++)
    	{
    		System.out.print("*");
    	}
    	System.out.println();
    }
    	
	}

}
