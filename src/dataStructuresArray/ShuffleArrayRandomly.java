package dataStructuresArray;

import java.util.Arrays;
import java.util.Random;

public class ShuffleArrayRandomly {

	
	public static void main(String[] args)
	{
		int[] ar = {8,11,22,0,5};
	}
	
	public static void randomShuffle(int[] ar)
	{
		Random r = new Random();
		int n = ar.length,temp;
		
		for(int i =n-1;i>0;--i)
		{
			int j = r.nextInt(i);
			temp = ar[i];
			ar[i]= ar[j];
			ar[j] = temp;
		}
		
		System.out.println(Arrays.toString(ar));
	}
}
