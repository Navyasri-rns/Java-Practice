package pattern;

public class NumericPattern {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j); //for different numbers we use j instead of i
			}
			System.out.println("");
		}
	}

}
