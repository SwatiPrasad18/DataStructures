/*
 * Given an array of n distinct elements, 
 * the task is to find all elements in array which have at-least two greater elements than themselves.
 * 
 * Approach:
 * Find second largest number
 * print all numbers less than second hisgest number
 */


package dataStructuresArray;

public class ElementsHAvingAtleast2GreaterElements {
	
	public static void main(String[] args)
	{
		int[] ar = {2, 8, 7, 1, 5};
		printElements(ar);
	}
	
	public static void printElements(int[] ar)
	{
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		int n = ar.length;
		
		for(int i=0;i<n;i++)
		{
			if(ar[i]>first)
			{
				second = first;
				first =  ar[i];
			}
				else if(ar[i]> second && ar[i]!=second)
						second = ar[i];
		}
		
		for(int j=0;j<n;j++)
		{
			if(ar[j]<second)
				System.out.println(ar[j]);
		}
		
	}
	
	

}
