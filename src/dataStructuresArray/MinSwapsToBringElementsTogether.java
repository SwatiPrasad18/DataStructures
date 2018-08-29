/*
 * Minimum swaps required to bring all elements less than or equal to k together
 * 1.Find count of all elements which are less than or equals to ‘k’. Let’s say the count is ‘cnt’
 * 2. Using two pointer technique for window of length ‘cnt’, each time keep track of how many elements 
 * 		in this range are greater than ‘k’. Let’s say the total count is ‘bad’.
 * 3. Repeat step 2, for every window of length ‘cnt’ and take minimum of count ‘bad’ among them.
 * 		This will be the final answer
 */
package dataStructuresArray;

public class MinSwapsToBringElementsTogether {

	public static void main(String[] args)
	{
		int[] ar = {2, 7, 9, 5, 8, 7, 4};
		minSwaps(ar, 5);
		//minSwaps(ar, 8);
	}
	
	public static void minSwaps(int[] a, int k)
	{
		int count = 0, n = a.length;
		for(int i=0; i< n;i++)
		{
			if(a[i]<=k)
				++count;
		}
		
		int bad = 0;
		for(int i=0;i<count;i++)
		{
			if(a[i]>k)
				++bad;
		}
		
		int ans = bad;
		
		for(int i=0,j=count;j<n;++i,j++)
		{
			if(a[i]>k)
				--bad;
			if(a[j]>k)
				++bad;
			ans = Math.min(ans, bad);
		}
		System.out.println("Min Swaps: "+ans);
	}
}
