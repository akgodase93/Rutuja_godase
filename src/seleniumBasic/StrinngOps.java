package seleniumBasic;

public class StrinngOps {

	public static void main(String[] args) {
		
		//String literals will create one memory allocation for string object which has same value in it 
		
		String s= "Akshay Godase Selenium";
		//String s1= "Akshay Godase Selenium";
		
		
		//String object creation using new keyword will mappnew storage location for each object
		
		//String s2=new String("Akshay Godase Selenium");
		//String s3=new String("Akshay Godase Selenium");
		
		//spliting String array by whitespaces
		String[] splitArr=s.split(" ");
		for(String a:splitArr)
		{
			System.out.println(a);
		}
		
		System.out.println("*****Split array by Godase keyword/Whitespaces also will be considered");
		 splitArr=s.split("Godase");
		 for(String a:splitArr)
			{
				System.out.println(a);
			}
		 
		 System.out.println("*********Print the array character by character********");
		 
		 for(int i=0 ; i<s.length(); i++)
		 {
			 System.out.println(s.charAt(i));
		 }
		
		 System.out.println("*********Print the array character by reverse order********");
		for(int i=s.length()-1; i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
	}

}
