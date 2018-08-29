package dataStructuresArray;

import java.util.Arrays;

public class NumberAtEvenIndexLessThanNumberAtOddIndex {

	public static void main(String[] args)
	{
		int[] ar = {55,33,2,0,7,3,9};
		rearrange(ar);
	}

	public static void rearrange(int[] ar)
	{
		Arrays.sort(ar);
		//int[] temp = new int[ar.length];

		int n = ar.length;
		int tempVal;
		for(int i =1;i<n;i++)
		{
			if(i%2==0 && ar[i]>ar[i-1])
			{
				tempVal = ar[i];
				ar[i]=ar[i-1];
				ar[i-1] =tempVal;
			}
			
			if(i%2!=0 && ar[i]<ar[i-1])
			{
				tempVal =ar[i];
				ar[i] =ar[i-1];
				ar[i-1] = tempVal;
			}
		}
		
		System.out.println(Arrays.toString(ar));
	}
}
