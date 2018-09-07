package dataStructuresArray;

import java.util.Arrays;

public class ArrayElementAsMultiplicationOfPreviousAndNext {

	

	public static void main(String[]  args)
	{
		int[] ar = {2, 3, 4, 5, 6};
		multiplyElements(ar);
			
	}
	
	public static void multiplyElements(int[] ar)
	{
		int prev = ar[0], n =ar.length;
		if(n<=1)
			System.out.println("Not possible");
		else
			ar[0] = ar[0]*ar[1];
			
		//Updating remaining fields
			for(int i=1;i<n-1;i++)
			{
				int curr = ar[i];
				ar[i] = prev*ar[i+1];
				prev = curr;	
			}
			
			ar[n-1] = prev*ar[n-1];
		
		System.out.println(Arrays.toString(ar));
	}
}
