package rutujapract_JAVA;

import java.util.ArrayList;

public class arraylist1
{
	public static void main(String[] args)
	{
		ArrayList<String> a=new ArrayList<String>();
		a.add("rutuja");
		a.add("akshu");
		a.add("omii");
		
		for(String val: a)
		{
			System.out.println(val);
		}
		System.out.println(a.contains("omii"));
	}
}
