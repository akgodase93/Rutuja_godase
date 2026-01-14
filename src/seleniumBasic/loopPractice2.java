package seleniumBasic;
/*
10 9 8 7 
6 5 4 
3 2 
1 
 */

public class loopPractice2 {

	public static void main(String[] args) {

		int num=10;
		int rows=4;
		
		
		for (int i = rows; i >= 1; i--) 
		{
            for (int j = 1; j <= i; j++)
            {
                System.out.print(num + " ");
                num--;
            }
            System.out.println();
		}
		
		
	}
}
