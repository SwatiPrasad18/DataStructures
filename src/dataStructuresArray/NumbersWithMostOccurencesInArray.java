package dataStructuresArray;

import java.util.HashMap;
import java.util.Map.Entry;

public class NumbersWithMostOccurencesInArray {

	public static void main(String[] args)
	{
		int[] ar = {3, 1, 4, 4, 5, 2, 6, 1};
		mostOccurences(ar);
	}
	
	public static void mostOccurences(int[] ar)
	{
		HashMap<Integer,Integer> hMap = new HashMap<>();
		int n = ar.length;
		for(int i=0;i<n;i++)
		{
			if(hMap.containsKey(ar[i]))
				hMap.put(ar[i], hMap.get(ar[i])+1);
			else
				hMap.put(ar[i], 1);
		}
		
		int max = 0;
		for(Entry<Integer, Integer> val:hMap.entrySet())
		{
			if(max<val.getValue())
				max = val.getValue();
		}
		
		for(Entry<Integer,Integer> val2: hMap.entrySet())
		{
			if(val2.getValue() ==max)
				System.out.println(val2.getKey());
		}
	}
}

