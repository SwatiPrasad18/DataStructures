/*
 * Reorder an array according to given indexes
 * Given two integer arrays of same size, “arr[]” and “index[]”, reorder elements in “arr[]” according to given index array. 
 * It is not allowed to given array arr’s length
 * 
 *  Approach1:
 *  1.Use an auxiliary array temp[] of same size as given arrays.
 *  2.Traverse the given array and put all elements at their correct place in temp[] using index[].
 *  3.Finally copy temp[] to arr[] and set all values of index[i] as i.
 *  
 *  Approach2:
 *   Do following for every element arr[i]
 *    a) While index[i] is not equal to i
 *    	(i)  Store array and index values of the target (or 
 *    		correct) position where arr[i] should be placed.
 *    		The correct position for arr[i] is index[i])
 *    	(ii) Place arr[i] at its correct position. Also
 *    		 update index value of correct position.
 *    	(iii) Copy old values of correct position (Stored in
 *    		step (i)) to arr[i] and index[i] as the while 
 *    					loop continues for i.
 */

package dataStructuresArray;

import java.util.Arrays;

public class ReorderArray1AsPerArray2 {
	
	public static void main(String[] args)
	{
		int[] ar = {10, 11, 12};
		int[] index = {1, 0, 2};
		approach1Reorder(ar, index);
		
		int[] ar1 = {50, 40, 70, 60, 90};
		int[] index1 = {3,  0,  4,  1,  2};
		approach2Reorder(ar1, index1);
	}
	
	public static void approach1Reorder(int[] ar, int[] index)
	{
		int[] temp = new int[ar.length];
		int n = ar.length;
		
		for(int i=0;i<n;i++)
		{
			temp[index[i]] = ar[i];
		}
		
		for(int j=0;j<n;j++)
		{
			ar[j]=temp[j];

		}
		System.out.println(Arrays.toString(ar));
	}
	
	public static void approach2Reorder(int[] ar1, int[] index1)
	{
		for(int i=0;i<ar1.length;i++)
		{
			while(index1[i]!=i)
			{
				int oldTargetI = index1[index1[i]];
				char oldTargetE = (char)ar1[index1[i]];
				
				ar1[index1[i]] =ar1[i];
				index1[index1[i]] = index1[i];
				
				index1[i] =oldTargetI;
				ar1[i] = oldTargetE;
				
			}
		}
		
		System.out.println(Arrays.toString(ar1));
	}

}
