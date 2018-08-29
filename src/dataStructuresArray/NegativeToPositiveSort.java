/*
 * Rearrange positive and negative numbers with constant extra space
 * 
 * Approach: Modified Insertion Sort
 * 
 * Loop from i = 1 to n - 1.
 * a) If the current element is positive, do nothing.
 * b) If the current element arr[i] is negative, we 
 *    insert it into sequence arr[0..i-1] such that 
 *    all positive elements in arr[0..i-1] are shifted 
 *    one position to their right and arr[i] is inserted
 *    at index of first positive element.
 *     
 */
package dataStructuresArray;

import java.util.Arrays;

public class NegativeToPositiveSort {

	public static void main(String[] args)
	{
		int[] ar = {12,11,-13,-5,6,-7,5,-3,-6};
		sort(ar);
	}

	public static void sort(int[] ar)
	{
		int n = ar.length,key,j;
		for(int i =0;i<n;i++)
		{
			key = ar[i];
			if(key>0)
				continue;
			j=i-1;
			while(j>=0 && ar[j]>0)
			{
				ar[j+1] = ar[j];
				j=j-1;
			}
			ar[j+1]=key;
		}
		
		System.out.println(Arrays.toString(ar));
	}

}
