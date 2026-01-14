package seleniumBasic;

/*
    * 
   * * 
  * * * 
 * * * *
 
 */

public class DimondPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rows=5;
		
		for(int i=rows-1; i>=1; i--)
		{
			for(int j=1;j<=i; j++)
			{
				System.out.print(" ");
			}
			
			for(int k=rows-1;k>=i;k--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		int row=4;
		
		for(int i=1; i<=row; i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			
			for (int j=row-1; j>=i; j--)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	//both will give same output
		

//		for(int i=1; i<=rows-1; i++)
//		{
//			for(int j=rows-i; j>=1; j--)
//			{
//				System.out.print(" ");
//			}
//			
//			for(int k=1; k<=i;k++)
//			{
//				System.out.print("* ");
//			}
//			
//			System.out.println();
//		}
		
		
	}

}
