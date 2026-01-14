package seleniumBasic;

public class DimondPattern2 {

	public static void main(String args[])
	{
		int rows=5;
		for(int i=1; i<=rows; i++)
		{
			//print spaces
			for(int j=rows-i;j>=1; j--)
			{
					System.out.print(" ");
			}
			
			for(int k=1; k<=i;k++)
			{
					System.out.print("* ");
			}
			System.out.println();
		}
	
		int row=4;
		for(int i=1; i<=row;i++)
		{
			//print blank spaces
			for(int j=1; j<=i; j++)
			{
				System.out.print(" ");
			}
			
			//print *
			for(int k=rows-i; k>=1; k--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
