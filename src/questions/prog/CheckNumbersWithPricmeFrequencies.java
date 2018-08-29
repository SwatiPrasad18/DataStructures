package questions.prog;

import java.util.HashMap;
import java.util.Map;

public class CheckNumbersWithPricmeFrequencies {

	public static void main(String args[])
	{
		int[] arraySet1 = {1,2,3,3,7,4,1,7,8,8,8,5};
		int[] arraySet2 = {6,1,2,7,3,6,7,4,1};
		
		//printFrequencies(arraySet1,3);
		printFrequencies(arraySet2,2);
	}
	
	public static void printFrequencies(int[] arrToCheck, int primeNumber)
	{
		Map<Integer, Integer> frequencyMap = new HashMap<>();
		for(int iArr = 0; iArr < arrToCheck.length; iArr++)
		{
			int iVariable = arrToCheck[iArr];
			
			int iFrequency;
			if(frequencyMap.containsKey(iVariable))
			{
				iFrequency = frequencyMap.get(iVariable);
				iFrequency++;
			}
			else
				iFrequency = 1;	
			
			frequencyMap.put(iVariable, iFrequency);
		}
		
		for(Map.Entry<Integer, Integer> mapEntry : frequencyMap.entrySet())
		{
				int iFrequencyValue = mapEntry.getValue();
				if(isPrime(iFrequencyValue) && iFrequencyValue>= primeNumber)
					System.out.println(mapEntry.getKey());			
		}
	}
	
	public static boolean isPrime(int iValue)
	{
		
		if((iValue > 2 && iValue % 2 ==0)||iValue == 1)
				return false;
		
		for(int iVal = 3; iVal <= (int)Math.sqrt(iValue); iVal+=2)
		{
			if(iValue%iVal == 0)
				return false;
		}
		
		return true;		
	}
}
