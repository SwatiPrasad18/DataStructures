package questions.prog;

import java.util.Arrays;

public class UnionOfArrays {

	public static void main(String args[])
	{
		int arr1[] = {3,6,5,4};
		int arr2[] = {4,5,4,7};

		unionArray(arr1, arr2);
		
		int arr3[] = {3,4,4,6};
		int arr4[] = {4,5,5,7};

		//unionArray(arr3, arr4);
	}

	static void unionArray(int[] arrValue1, int[] arrValue2)
	{
		Arrays.sort(arrValue1);
		Arrays.sort(arrValue2);
		

		int i =0,j= 0;

			while(i<arrValue1.length && j<arrValue2.length)
			{
				if(arrValue1[i]<arrValue2[j])
				{
					System.out.println(arrValue1[i]);
					i++;
				}
				else
					if(arrValue2[j]<arrValue1[i])
					{
						System.out.println(arrValue2[j]);
						j++;
					}
					else
					{
						System.out.println(arrValue1[i]);
						i++;
						j++;
					}
			}
			
			if(i<arrValue1.length)
				while(i<arrValue1.length)
				{
					{
						System.out.println(arrValue1[i]);
						i++;
					}
				}
			
			if(j<arrValue2.length)
			{
				while(j<arrValue2.length)
				{
					{
						System.out.println(arrValue2[j]);
						j++;
					}
				}	
			}
		}
	}

