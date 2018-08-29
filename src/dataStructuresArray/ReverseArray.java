/*
 * Reverse a given array
 * given two implementation using for and while loop
 *take 2 pointers, start one from the beginning and other from end
 *Loop while first pointer is less than second, keep swapping the elements
 */
package dataStructuresArray;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args)
	{
		int[] ar1 = {44,88,1,2,9};
		int[] ar2 = {4,8,1,2,9,6};
		int[] ar3 = {4,0,1,6,9,86};
		reverseArrayForLoop(ar1);
		reverseArrayWhileLoop(ar2);
		reverseArraySingleIterator(ar3);
	}

	public static void reverseArrayForLoop(int[] ar)
	{
		//for loop
		int n = ar.length;
		int i,j, temp;
		for( i = 0, j=n-1;i<j;i++,j--)
		{
			temp = ar[i];
			ar[i] =ar[j];
			ar[j] = temp;
		}

		System.out.println("For Loop");
		for(int k=0;k<n;k++)
		{
			System.out.println(ar[k]);
		}
	}

	public static void reverseArrayWhileLoop(int[] ar)
	{
		//while loop
		int n = ar.length;
		int i=0,j=n-1, temp;
		while(i<j)
		{
			temp = ar[i];
			ar[i] = ar[j];
			ar[j] = temp;
			i++;
			j--;
		}
		System.out.println("While Loop");
		for(int k=0;k<n;k++)
		{
			System.out.println(ar[k]);
		}
	}
	
	public static void reverseArraySingleIterator(int[] ar)
	{
		int n = ar.length,temp;
		
		for(int i =0; i<n/2;i++)
		{
			temp = ar[i];
			ar[i] =  ar[n-i-1];
			ar[n-i-1] = temp;
		}
		
		System.out.println(Arrays.toString(ar));
	}
}
