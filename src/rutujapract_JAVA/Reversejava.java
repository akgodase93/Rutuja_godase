package rutujapract_JAVA;

public class Reversejava 
{
	public static void main(String[] args)
	{
		double arr[]= {0.1, 0.5, 0.6, 0.2};
		System.out.println("First number ofarray : "+ arr[0]);
		System.out.println("First number ofarray : "+ arr[3]);
		//print array in sequence
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		//Print array in reverse
		System.out.println("reverse array");
		for(int j=arr.length-1; j>=0; j--)
		{
			System.out.println(arr[j]);
		}
		String[] arr2= {"rutuja","Akshay","omii"};
		for( String s:arr2)
		{
			System.out.print( s +" , ");
		}	
		
	}
}
