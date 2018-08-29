/*
 * Sorted Array 0 to m
 * Missing number would be the index number
 */

package dataStructuresArray;

public class SmallestMissingNumberInSortedArray {

	public static void main(String[] args)
	{
		int[] ar = {0,2,3,4,5};
		findNumber(ar);
	}
	
	public static void findNumber(int[] ar)
	{
		int m = ar.length,i;
		for(i=0; i<m;i++)
		{
			if(ar[i]!=i)
				break;
		}
		System.out.println("Missing number is: "+i);
	}
}
