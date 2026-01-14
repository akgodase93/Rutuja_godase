package seleniumBasic;

public class start1 
{
	public static void main(String[]args)
	{
		int row=4;
		for(int i=row; i>=1; i--)
		{
			for(int j=1; j<=row; j++)
			{
				System.out.print("*"+ " ");
	
			}
			System.out.println();
		}
	}
}
