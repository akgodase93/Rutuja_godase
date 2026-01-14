package seleniumBasic;

/*
 * 
 	# 
   # # 
  # # # 
 # # # # 
# # # # # 
 # # # # 
  # # # 
   # # 
    # 
 * 
 */

public class DimondPattern3 {
	public static void main(String[] args) {
		
		int rows=5;
		
		//Upper half of Diamond 
		for(int i=1; i<=rows; i++)
		{
			//print blank spaces
			for(int j=rows-i; j>=1; j--)
			{
				System.out.print(" ");
			}
			
			//print * pattern
			for(int k=1; k<=i; k++)
			{
				System.out.print("# ");
			}
			System.out.println();
		}
		
		int row=4;
		//lower half of diamond
		for(int i=1; i<=row; i++)
		{
			//print blank spaces
			for(int j=1; j<=i; j++)
			{
				System.out.print(" ");
			}
			
			//print * pattern
			for(int k=row; k>=i;k--)
			{
				System.out.print("# ");
			}
			System.out.println();
		}
	}

}
