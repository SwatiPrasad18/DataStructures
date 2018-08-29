package questions.prog;

import java.util.HashMap;
import java.util.Map;

public class CharactersWithFrequencies {

	public static void main(String args[])
	{
		String arrSet1 = "hiiijijiojipoujoi";
		char[] arraySet1 = arrSet1.toCharArray();
		String arrSet2 = "geeksforgeeks";
		char[] arraySet2 = arrSet2.toCharArray();

		//printFrequencies(arraySet1);
		printFrequenciesLoop("Apple");
		//String neSt= 
	}

	public static void printFrequencies(char[] arrToCheck)
	{
		Map<Character, Integer> frequencyMap = new HashMap<>();
		for(int iArr = 0; iArr < arrToCheck.length; iArr++)
		{
			char cVariable = arrToCheck[iArr];

			int iFrequency;
			if(frequencyMap.containsKey(cVariable))
			{
				iFrequency = frequencyMap.get(cVariable);
				System.out.println(cVariable);
				iFrequency++;
			}
			else
				iFrequency = 1;	

			frequencyMap.put(cVariable, iFrequency);
		}

		System.out.println("--------------Map------------");
		for(Map.Entry<Character, Integer> mapEntry : frequencyMap.entrySet())
			System.out.println(mapEntry.getKey()+":"+mapEntry.getValue()+" ");
		System.out.println("-----------------------------");
	}

	public static void printFrequenciesLoop(String st)
	{

		int[] freq = new int[256];

		// For each character, increment count in the frequency table
		for (char ch : st.toCharArray()) {
			freq[ch]++;
			System.out.println(freq[ch]);
		}

		String result = "";
		System.out.println("Frequencies : ");
		for (int i = 0; i < freq.length; i++) {
			// Print results for which count > 0
			// (char) i => Character
			// freq[i] => Frequency of character
			if (freq[i] != 0) {
				System.out.println("Char : " + (char) i + ", Count : "
						+ freq[i]);
				result = result+(char)i+freq[i];
			}
			
		}
		System.out.println(result);

	}
}
