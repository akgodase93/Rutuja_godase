package rutujapract_JAVA;

import java.util.Arrays;
import java.util.List;

public class Convertarraytolist 
{
	public static void main(String args[])
	{
		String[] a= {"rutuja", "akshay", "godase"};
	    List<String> b=Arrays.asList(a);
	    System.out.print(b.contains("godase"));
	}
}
