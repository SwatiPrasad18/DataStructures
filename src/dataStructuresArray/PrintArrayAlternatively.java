/* 
 * Given an array of integers, print the array in such a way that the first element is first maximum and 
 * second element is first minimum and so on.
 * 
 * Approach:
 * Sort array
 * take 2 pointer, from the beginning and end, till start<end
 * increment start, decrement end
 * print alternatively
 * 
 */

package dataStructuresArray;

import java.util.Arrays;

public class PrintArrayAlternatively {
	
	public static void main(String[] args)
	{
		int[] ar = {7, 1, 2, 3, 4, 5, 6};
		printArray(ar);
	}
	
	public static void printArray(int[] ar)
	{
		Arrays.sort(ar);
		int n = ar.length;
		
		for(int i=0,j=n-1; i<j;i++,j--)
		{
			System.out.println(ar[j]);
			System.out.println(ar[i]);
		}
	}

}
