package dataStructuresArray;

public class LinearSearch {

	public static void main(String[] args)
	{
		int[] ar = {0,120,30,77,50};
		linearSearch(ar,77);
	}
	
	public static void linearSearch(int[] ar, int val)
	{
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==val)
			{
				System.out.println("Value Found");
				break;
			}
		}
	}
}
