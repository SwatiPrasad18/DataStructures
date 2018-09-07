/*
 * An Array of integers is given, both +ve and -ve. 
 * You need to find the two elements such that their sum is closest to zero
 * 
 * Approach1:
 * sort all elements
 * use 2 pointers from left and right
 * 		if sum is negative l++
 * 		if sum is positive r--
 */

package dataStructuresArray;

import java.util.Arrays;

public class TwoElementsWithSumClosestToZero {

	public static void main(String[] args)
	{
		int[] ar = {1, 60, -10, 70, -80, 85};
		findElements(ar);
	}
	
	public static void findElements(int[] ar)
	{
		Arrays.sort(ar);
		
		int n = ar.length, min_l=0;
		int l=0,r=n-1, min=Integer.MAX_VALUE, sum,min_r=n-1;
		while(l<r)
		{
			sum=ar[l]+ar[r];
			if(Math.abs(sum)<Math.abs(min))
			{
				min = sum;
				min_l = l;
				min_r = r;
			}
			
			if(sum<0)
				l++;
			else
				r--;
		}
		
		System.out.println(ar[min_l]+":"+ar[min_r]);
	}
}
