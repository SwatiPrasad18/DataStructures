package dataStructuresArray;

public class SmallestAndSecondSmallestNumberInArray {

	public static void main(String[] args)
	{
		int[] ar = {12, 13, 1, 10, 34, 1};
		findSmallestAndSecondSmallest(ar);
	}
	
	public static void findSmallestAndSecondSmallest(int[] ar)
	{
		int first =Integer.MAX_VALUE, second =Integer.MAX_VALUE;
		int n = ar.length;
		for(int i =0;i<n;i++)
		{
			if(ar[i]<first)
			{
				second = first;
				first = ar[i];
			}
			else if (ar[i]< second && ar[i]!=first)
				{
					second = ar[i];
				}		
		}
		
		System.out.println(first+" : "+second);
	}
}
