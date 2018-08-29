package questions.prog;

import java.util.Arrays;

public class MissingNumbersFromArray {

	public static void main(String args[])
	{
		int arr1[] = {5};
		int arr2[] = {2,3,5,7,9};
		int arr3[] = {3,6,9};
		//checkMissing(arr1);
		//checkMissing(arr2);
		checkMissing(arr3);
	}

	public static void checkMissing(int[] A)
	{
		Arrays.sort(A);
		int ilength = A.length;

		if(ilength!=1)
		{
			for(int i = 0;i<=ilength-2;i++)
			{
				if(A[i+1]-A[i]!=1)
				{
					System.out.println(A[i]+1);
				}
				
				//if()
			}
		}
	}
}
