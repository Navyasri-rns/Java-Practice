package pattern;

public class ReversePyramid
{

	public static void main(String[] args)
	{
		for(int i=0;i<=4;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=4;k>=i;k--)
			{
				System.out.print("*");
			}
			for(int l=3; l>=i;l--)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
   }
}
