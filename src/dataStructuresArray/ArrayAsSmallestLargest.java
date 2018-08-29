/*
 * Rearrange as smallest, largest, second smallest, second largest
 *  
 *  Sort the array.
 *  take a new iterator, for the new arrangement
 *  start two iterator, one from beginning and another from end till the middle
 *  put data in the newArray[newIterator] as per a[i] or a[j]
 */

package dataStructuresArray;

import java.util.Arrays;

public class ArrayAsSmallestLargest {
	public static void main(String[] args)
	{
		int[] ar = {5, 8, 1, 4, 2, 9, 3, 7, 6};
		reArrangeSmallestLargest(ar);
	}
	
	public static void reArrangeSmallestLargest(int[] ar)
	{
		Arrays.sort(ar);
		int n = ar.length;
		int[] tempArray = new int[n];
		int i, j, newIndex =0;
		
		for(i=0,j=n-1;i<=n/2||j>=n/2;i++,j--)
		{
			if(newIndex<n)
			{
				tempArray[newIndex]=ar[i];
				newIndex++;
			}
			if(newIndex<n)
			{
				tempArray[newIndex]=ar[j];
				newIndex++;
			}
		}
		
		System.out.println(Arrays.toString(tempArray));
	}

}
