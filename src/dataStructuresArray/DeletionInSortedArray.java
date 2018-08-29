/*
 * Deletion in sorted array
 * 1. Perform binary search
 * 2. delete by shifting
 * 
 */
package dataStructuresArray;

public class DeletionInSortedArray {
	
	public static void main(String[] args)
	{
		int[] ar = {10,20,30,40,50};
		int val = 40;
		deletionInSorted(ar,val);
		
	}
	
	public static void deletionInSorted(int[] ar, int val)
	{
		int low = 0, high = ar.length-1;
		int pos = binarySearch(ar,val,low,high);
		
		int n = ar.length;
		if(pos>-1)
		{
			for(int i=pos;i<n;i++)
			{
				ar[i] =ar[i+1];
				n--;
			}
		}
		
		for(int j=0;j<n;j++)
		{
			System.out.println(ar[j]);
		}
	}

	public static int binarySearch(int[] ar, int val, int low, int high)
	{
		if(high<low)
			return -1;
		int mid = (low+high)/2;
		if(val==ar[mid])
			return mid;
		else
		{
			if(val<ar[mid])
				return binarySearch(ar,val, low, mid);
			else
				return binarySearch(ar,val, mid+1, high);
		}
	}
}
