package dataStructuresArray;

public class MaxSumNo2ElementsAreAdjacent {

	public static void main(String[] args)
	{
		int[] ar = {5, 5, 10, 100, 10, 5};
		sum(ar);
	}
	
	public static void sum(int[] ar)
	{
		int incl = ar[0];
		int excl= 0, excl_new;
		
		for(int i=1;i<ar.length;i++)
		{
			excl_new =(incl>excl)?incl:excl;
			incl = excl+ar[i];
			excl = excl_new;
		}
		 int maxSum = (incl>excl)?incl:excl;
		 System.out.println(maxSum);
	}
}
