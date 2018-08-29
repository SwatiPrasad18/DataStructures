/*
 * Compare if arrays are equal
 */
package questions.prog;

import java.util.Arrays;

public class ArrayComparison {

	public static void main(String args[])
	{
		int arr1[] = {1,2,3,4};
		int arr2[] = {2,3,4,5};		

		if(compareArray(arr1, arr2))
		{
			System.out.println("Equal. True");
		}
		else
		{
			System.out.println("Not Equal. False");
		}
		
		if(Arrays.equals(arr1, arr2))
		{
			System.out.println("Again Equal");
		}
		else
		{
			System.out.println("AgainFalse");
		}
	}

	public static boolean compareArray(int[] A, int[] B)
	{
		for(int i = 0; i <= A.length; i++)
		{
			System.out.println(A[i]);
			System.out.println(B[i]);

			if(A[i] != B[i])
			{
				return false;
			}
		}
		return true;
	}
	
}

