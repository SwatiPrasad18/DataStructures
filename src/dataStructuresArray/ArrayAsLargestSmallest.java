package dataStructuresArray;

import java.util.Arrays;

/*
 *  Rearrange as largest,smallest, second largest,second smallest, 
 *  
 *  Sort the array.
 *  take a new iterator, for the new arrangement
 *  start two iterator, one from beginning and another from end till the middle
 *  put data in the newArray[newIterator] as per a[i] or a[j]
 */
public class ArrayAsLargestSmallest {
	
	public static void main(String[] args)
	{
		int[] ar = {5, 8, 1, 4, 2, 9, 3, 7, 6};
		reArrangeLargestSmallest(ar);
		int[] ar2 = {8, 1, 4, 2, 9, 3, 7, 6};
		reArrangeSmallestLargest2(ar2);
	}
	public static void reArrangeLargestSmallest(int[] ar)
	{
		int temp[] =new int[ar.length];
		int n = ar.length;
		int small=0,large=n-1;
		boolean flag = true;
		
		Arrays.sort(ar);
		for(int i=0;i<n;i++)
		{
			if(flag)
				temp[i]=large--;
			else 
				temp[i]=small++;
			flag=!flag;
		}
		
		System.out.println(Arrays.toString(temp));
	}
	
	public static void reArrangeSmallestLargest2(int[] ar)
	{
		Arrays.sort(ar);
		int n = ar.length;
		int[] tempArray = new int[n];
		int i, j, newIndex =0;
		
		for(i=0,j=n-1;i<=n/2||j>=n/2;i++,j--)
		{
			if(newIndex<n)
			{
				tempArray[newIndex]=ar[j];
				newIndex++;
			}
			if(newIndex<n)
			{
				tempArray[newIndex]=ar[i];
				newIndex++;
			}
		}
		
		System.out.println(Arrays.toString(tempArray));
	}
}
