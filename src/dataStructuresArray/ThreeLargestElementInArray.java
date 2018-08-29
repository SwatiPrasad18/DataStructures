package dataStructuresArray;

public class ThreeLargestElementInArray {

	public static void main(String[] args)
	{
		int[] ar = {4,66,67,0};
		findThreeLargestElement(ar);
	}
	
	public static void findThreeLargestElement(int[] ar)
	{
		int n = ar.length;
		if(n<3)
		{
			System.out.println("No such element");
		}
		else
		{
			int first = Integer.MIN_VALUE;
			int second = Integer.MIN_VALUE;
			int third = Integer.MIN_VALUE;
			
			for(int i=0;i<n;i++)
			{
				if(ar[i]>first)
				{
					
					third = second;
					second = first;
					first = ar[i];
				}
				else if(ar[i]>second)
					{
						third = second;
						second = ar[i];
					}
					else if(ar[i]>third)
						{
							third = ar[i];
						}
			}
			
			System.out.println(first+":"+second+":"+third);
		}
	}
}

