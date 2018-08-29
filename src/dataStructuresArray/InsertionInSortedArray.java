/*
 * In an unsorted array, the insert operation is faster as compared to sorted array because we don’t have to care about the position at which the element to be placed.
 *    Inserts a key in arr[] of given 
 *    capacity.  n is current size of arr[]. 
 *    This function returns n+1 if insertion
 *   is successful, else n.
 */

package dataStructuresArray;

import java.util.Arrays;

public class InsertionInSortedArray {

	
	public static void main(String[] args)
	{
		int[] ar = {12, 16, 20, 40, 50, 70};
		int n=6; 
		int capacity = ar.length;
		int key = 26;
		
		n = insertInSorted(ar, n, capacity, key);
		System.out.println(Arrays.toString(ar));
	}
	
	public static int insertInSorted(int[] sort, int n, int capacity, int key)
	{
		if(n>=capacity)
			return n;
		
		int i;
		for(i=n-1;(i>=0 && sort[i]>key); i--)
		{
			sort[i+1]=sort[i];
		}
		sort[i+1] =  key;
		
		return n+1;
	}
}
