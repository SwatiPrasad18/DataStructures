package interviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class test {

	
	public static void main(String[] args)
	{
		/*String val = countDuplicate("aaabbbaannddn");
		System.out.println(val);*/
		int[] a = {2,3,4,5};
		int[] b = {3,4,5,6,7,8};
		sum(a,b);
	}
	public static String countDuplicate(String s) {
	    StringBuilder result = new StringBuilder();

	    // count letters
	    int[] counter = new int[300];
	    for (char c : s.toCharArray()) {
	        counter[c]++;
	    }

	    // build answer
	    boolean[] isProcessed = new boolean[300];
	    for (char c : s.toCharArray()) {
	        if (isProcessed[c]) {
	            continue;
	        }

	        isProcessed[c] = true;

	        result.append(c).append(counter[c]);
	    }

	    return result.toString();
	}
	
	public static void sum(int[] a, int[] b)
	{
		int length = a.length>b.length?b.length:a.length;
		
		List<Integer> sumList = new ArrayList<>();
		int sum=0;
		int a1 =0, a2 =0;
		int i=0;
		while(i<length)
		{
			sum = a[i]+b[i];
			if(sum<=9)
				sumList.add(sum);
			else
			{
				a1 = sum/10;
				a2 = sum%10;
				sumList.add(a1);
				sumList.add(a2);
			}
			i++;	
		}
		
		while(i<a.length)
		{
			sumList.add(a1);
		}

		while (i<b.length) 
		{
			sumList.add(a2);
			
		}

		System.out.println(sumList);
	}
}
