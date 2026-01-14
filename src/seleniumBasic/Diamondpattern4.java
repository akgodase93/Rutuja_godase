package seleniumBasic;

public class Diamondpattern4 {

	public static void main(String[] args) {
		int rows = 5;
		int row = 4;

		// Upper Half of Diamod
		for (int i = 1; i <= rows; i++)
		{
			// print blank spaces
			for (int j = rows - i; j >= 1; j--)
			{
				System.out.print(" ");
			}

			// print * pattern
			for (int k = 1; k <= i; k++)
			{
				System.out.print("* ");

			}
			System.out.println();

		}

		// Lower half of the Diamond
		for (int i = 1; i <= row; i++) {
			//if (i != 1) {
				// print blank spaces
				for (int j = 1; j <= i; j++) {
					System.out.print(" ");
				}

				// print * pattern
				for (int k = row; k >= i; k--) {
					System.out.print("* ");
				}
				System.out.println();
			//}
		}

	}

}
