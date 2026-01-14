package seleniumBasic;

public class array1 {

	public static void main (String[] args) {
	    /* code */
	    //double[] arr= {1,2.0, 3.3,4,5.6};
	    
		int[] arr= {1,2,3,4,5};
	    System.out.println(arr[0]);
	    System.out.println(arr[4]);
	    
	    for(int i=arr.length-1; i>=0; i--)
	    {
	        System.out.print(arr[i]+" ");
	    }
	    
	    System.out.println();
	    int count=0;
	    
	      for(int i=arr.length; i>0; i--)
	    {
	        count ++;
	    }
	    System.out.println(count);
	}

}
