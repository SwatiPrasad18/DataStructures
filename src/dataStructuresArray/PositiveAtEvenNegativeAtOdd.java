package dataStructuresArray;

import java.util.Arrays;

public class PositiveAtEvenNegativeAtOdd {

	public static void main(String[] args)
	{
		int[] ar = {1, -3, 5, 6, -3, 6, 7, -4, 9, 10};
		positiveNegative(ar);
	}
	
	public static void positiveNegative(int[] ar)
	{
		int size = ar.length;
		int positive =0, negative =1, temp;
		while(true)
		{
			while(positive < size && ar[positive]>=0)
				positive+=2;
			while(negative<size && ar[negative]<=0)
				negative+=2;
			if(positive<size && negative < size)
			{
				temp =ar[positive];
				ar[positive] =ar[negative];
				ar[negative] = temp;
			}
			else
				break;
		}
		
		System.out.println(Arrays.toString(ar));
	}
}
