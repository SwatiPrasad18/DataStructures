package questions.prog;

import java.util.HashMap;
import java.util.Map;

public class NumbersWithFrequencies {

	public static void main(String args[])
	{
		int[] arraySet1 = {1,2,3,3,7,4,1};
		int[] arraySet2 = {6,1,2,7,3,6,7,4,1};
		
		printFrequencies(arraySet1);
		printFrequencies(arraySet2);
	}
	
	public static void printFrequencies(int[] arrToCheck)
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
		
		System.out.println("--------------Map------------");
		for(Map.Entry<Integer, Integer> mapEntry : frequencyMap.entrySet())
				System.out.println(mapEntry.getKey()+":"+mapEntry.getValue()+" ");
		System.out.println("-----------------------------");
	}
}
