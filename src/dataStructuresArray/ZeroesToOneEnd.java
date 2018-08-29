/*
 * Move all zeroes to one end
 */
package dataStructuresArray;

public class ZeroesToOneEnd {

	public static void main(String[] args)
	{
		int[] ar = {12,0,6,7,0,8,0,1,0};
		moveToOneEnd(ar);
		moveToOneEndSingleTraversal(ar);
	}

	public static void moveToOneEnd(int[] a)
	{
		int count =0;
		int n = a.length;
		for(int i=0; i<n;i++)
		{
			if(a[i]!=0)
				a[count++] =a[i];	
		}
		while(count<n)
		{
			a[count++] =0;
		}

		System.out.println("Two Loop");
		for(int k=0;k<n;k++)
		{
			System.out.println(a[k]);
		}

	}
	
	public static void moveToOneEndSingleTraversal(int[] a) 
	{
		int count =0, temp, n =a.length;
		for(int i=0;i<n;i++)
		{
			temp = a[i];
			a[count] =a[i];
			a[i] =temp;
			count++;
		}
		
		System.out.println("Single Loop");
		for(int k=0;k<n;k++)
		{
			System.out.println(a[k]);
		}
	}
}