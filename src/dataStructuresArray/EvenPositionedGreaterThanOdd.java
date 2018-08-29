/*
 * Rearrange array such that even positioned are greater than odd
 * 1. Sort the array
 * 2. start loop and put starting values in odd index and ending values in even index
 */
package dataStructuresArray;

import java.util.Arrays;

public class EvenPositionedGreaterThanOdd {
	
	public static void main(String[] args)
	{
		int[] ar = {9,6,4,0,88,43};
		assignGreater(ar);
	}

	public static void assignGreater(int[] a)
	{
		int n = a.length;
		Arrays.sort(a);
		
		int ans[] = new int[n];
		int p=0,q=n-1;
		
		for(int i=0;i<n;i++)
		{
			if((i+1)%2==0)
				ans[i] =a[q--];
			else
				ans[i] = a[p++];
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.println(ans[i]);
		}
	}
}
