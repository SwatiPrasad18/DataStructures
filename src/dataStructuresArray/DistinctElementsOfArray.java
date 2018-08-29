package dataStructuresArray;

import java.util.HashSet;

public class DistinctElementsOfArray {

	public static void main(String args[])
	{
		int[] ar = {5, 8, 1, 4, 2, 9, 9, 7, 6};
		printDistinct(ar);
	}
	
	public static void printDistinct(int[] ar)
	{
		HashSet<Integer> hSet = new HashSet<>();
		int n = ar.length;
		for(int i =0;i<n;i++)
		{
			if(!hSet.contains(ar[i]))
				hSet.add(ar[i]);
		}
		
		System.out.println(hSet);
	}
	
}
