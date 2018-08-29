package questions.prog;

import java.util.HashMap;
import java.util.Map;

public class CheckIfMapValuesAreEqualToFirstValue {

	public static void main(String args[])
	{
		checkIfValuesEqual("abbbbacadaf");
	}

	public static void checkIfValuesEqual(String strValue)
	{
		Map<Character, Integer> hMap = new HashMap<Character, Integer>();
		int iFreq;
		
		for(int i=0; i< strValue.length(); i++)
		{
			if(hMap.containsKey(strValue.charAt(i)))
			{
				iFreq = hMap.get(strValue.charAt(i));
				iFreq++;
				hMap.put(strValue.charAt(i), iFreq);
			}
			else
				hMap.put(strValue.charAt(i), 1);
		}
		
		int val=-1;
		for(Character ch: hMap.keySet())
		{
			if(val==-1)
			{
				val=hMap.get(ch);
			}
			else
				if(val!=hMap.get(ch))
					System.out.println("Not equal");
				else
					System.out.println("Equal");
		}
	}

}


