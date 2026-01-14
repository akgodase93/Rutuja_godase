package seleniumBasic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList<String> ar=new ArrayList<String>();
		
		ar.add("Akshay");
		ar.add("Godase");
		ar.add("TCS");
		ar.add("Selenium");
		
		System.out.println(ar.get(1));
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		
		for ( String a: ar)
		{
			System.out.print(a+" ");
		}

		String[] arr= {"akshay","Godase","tcs","selenum"};
		List<String> newArr=Arrays.asList(arr);
		System.out.println(newArr.contains("tcs"));
	}

}
