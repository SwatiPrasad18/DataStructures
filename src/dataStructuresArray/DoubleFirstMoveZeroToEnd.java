/*
 * Double the first element and move zero to end
 * Given an array of integers of size n. Assume ‘0’ as invalid number and all other as valid number.
 * Convert the array in such a way that if next valid number is same as current number, double its value and replace the next number with 0.
 * After the modification, rearrange the array such that all 0’s are shifted to the end.
 * 
 * Approach:
 * 1. If next valid number is same as current number, double its value and replace the next number with 0
 */
package dataStructuresArray;

public class DoubleFirstMoveZeroToEnd {

	public static void main(String[] args)
	{
		int[] ar = {2, 2, 0, 4, 0, 8};
		doubleAndMoveZeroToEnd(ar);
	}

	public static void doubleAndMoveZeroToEnd(int[] ar)
	{
		int n = ar.length;
		if(n==1)
		{
			System.out.println("No such");
		}
		else
		{
			for(int i=0;i<n-1;i++)
				if((ar[i]!=0) && (ar[i]==ar[i+1]))
				{
					ar[i] = 2*ar[i];
					ar[i+1] = 0;	
					i++;//to move 2 indexes

				}
			
			int count =0;
			for(int i=0;i<n;i++)
			{
				if(ar[i]!=0)
					ar[count++] = ar[i];
				while(count<n)
					ar[count++] =0;
			}
			
			for(int j=0;j<n;j++)
			{
				System.out.println(ar[j]);
			}
		}
	}
}
