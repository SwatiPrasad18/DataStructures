/*
 * Binary Search algorithm
 */

package dataStructuresArray;

import java.util.Arrays;

public class BinarySearch {
	
	public static void main(String[] args)
	{
		int[] ar = {5,3,9, 10,2,1,0};
		Arrays.sort(ar);
		System.out.println(Arrays.toString(ar));
		int high = ar.length, low=0;
		int searchVal =9;
		int pos =binarySearch(ar,searchVal,high,low);
		System.out.println(pos+1);
	}
	
	public static int binarySearch(int[] ar, int searchVal, int high, int low)
	{
		int mid =(low+high)/2;
				
		if(searchVal==ar[mid])
		{
			System.out.println("Element found");
			return mid;
		}
		
		if(searchVal>ar[mid])
			return binarySearch(ar, searchVal, high, (mid+1));
		else
			return binarySearch(ar, searchVal, (mid-1), low);
	}

}
