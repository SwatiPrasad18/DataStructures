package dataStructuresArray;

import java.util.HashSet;

public class DistinchPairsWithDifferenceEqualToK {

	public static void main(String[] args)
	{
		int[] ar = {1, 5, 3, 4, 2};
		int k=3;
		countDistinctPairs(ar, k);
	}
	
	public static void countDistinctPairs(int[] ar, int k)
	{
		int max = Integer.MAX_VALUE;
		
		HashSet<Integer> hSet = new HashSet<>();
		for(int i =0;i<ar.length;i++)
		{
			hSet.add(ar[i]);
		}
		
		int count =0;
		for(int i=0;i<ar.length;i++)
		{
			int x = ar[i];
			if((x+k)< max && hSet.contains(x+k))
				count++;
		}
		
		System.out.println(count);
	}
	
}
