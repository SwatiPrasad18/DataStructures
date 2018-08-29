package collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class StringTreeMap {

	public static void main(String[] args)
	{
		String[] fruits = {"Banana","Orange","Pineapple","Kiwi","Coconut","Peach"};
		TreeMap<Integer,String> fruitMap = new TreeMap<>();
		fruitMap = addToTreeMap(fruitMap,fruits);
		traverseTreeMap(fruitMap);
		copyTreeMap(fruitMap);
		
		searchKey(fruitMap,3);
		searchKey(fruitMap,10);
		searchValue(fruitMap,"Orange");
		searchValue(fruitMap,"White");
		
		getKey(fruitMap);
		
		greatestKeyValue(fruitMap);
		leastKeyValue(fruitMap);
		
		firstKey(fruitMap);
		lastKey(fruitMap);
		
		reverseKeys(fruitMap);
		greatestKeyValue(fruitMap, 4);
		greatestKeyValue(fruitMap, 9);
		greatestKey(fruitMap, 9);
		
		portionOfTreeStrictlyLessThanGivenKey(fruitMap,5);
		portionOfTreeStrictlyLessThanGivenKey(fruitMap,1);
		portionOfTreeStrictlyLessThanGivenKey(fruitMap,0);
		
		portionOfTreeLessThanOrEqualTo(fruitMap,6);
		portionOfTreeLessThanOrEqualTo(fruitMap, 1);
		
		leastKeyValueMappingStrictlyGreaterThanGivenKey(fruitMap,4);
		leastKeyValueMappingStrictlyGreaterThanGivenKey(fruitMap,9);
		
		greatestKeyValueMappingStrictlyLessThanGivenKey(fruitMap,8);
		greatestKeyValueMappingStrictlyLessThanGivenKey(fruitMap,0);
		
		navigableSetKeysOfMap(fruitMap);
		
		removeAndGetLeastKeyValue(fruitMap);
		traverseTreeMap(fruitMap);
		
		removeAndGetGreatestKeyValue(fruitMap);
		traverseTreeMap(fruitMap);
		
		getPortionOfMap(fruitMap,2,4);
		getPortionFromToMapInclusive(fruitMap,2,4);
		
		getPortionKeyGreaterOrEqualThanGivenValue(fruitMap,3);
		getPortionKeyGreaterThanGivenValue(fruitMap,3);
		
		getKeyValu(fruitMap,4);
		getKey(fruitMap,3);
		
		sortUsingComparator();
		
		deleteAllElements(fruitMap);
		traverseTreeMap(fruitMap);
	}
	
	public static TreeMap<Integer, String> addToTreeMap(TreeMap<Integer,String> strMap, String[] strArray)
	{
		for(int i=1;i<=strArray.length;i++)
		{
			strMap.put(i, strArray[i-1]);
		}
		return strMap;
	}
	
	public static void traverseTreeMap(Map<Integer,String> strMap)
	{
		System.out.println("Printing Collection: "+strMap);
		System.out.println("===========================");
		for(Map.Entry<Integer,String> entryVal:strMap.entrySet())
		{
			System.out.println(entryVal.getKey()+" : "+entryVal.getValue());
		}
		System.out.println("===========================");
	}
	
	public static void copyTreeMap(Map<Integer,String> strMap)
	{
		Map<Integer,String> neMap = new TreeMap<>(strMap);
		System.out.println("Copied TreeMap: "+neMap);
		
		neMap.putAll(strMap);
		System.out.println("All Elements put: "+neMap);
	}
	
	public static void searchKey(Map<Integer,String> strMap, int givenKey)
	{
		if(strMap.containsKey(givenKey))
			System.out.println("Key is present");
		else
			System.out.println("Key is not present");
	}
	
	public static void searchValue(Map<Integer,String> strMap, String givenValue)
	{
		if(strMap.containsValue(givenValue))
			System.out.println("Value is present");
		else
			System.out.println("Value is not present");
	}
	
	public static void getKey(Map<Integer,String> strMap)
	{
		Set keyVal = strMap.keySet();
		System.out.println("Key Set is: "+keyVal);
	}
	
	public static void deleteAllElements(Map<Integer,String> strMap)
	{
		strMap.clear();
	}
	
	public static void greatestKeyValue(TreeMap<Integer,String> strMap)
	{
		System.out.println("First Element: "+strMap.firstEntry());
	}
	
	public static void leastKeyValue(TreeMap<Integer,String> strMap)
	{
		System.out.println("Last Element: "+strMap.lastEntry());
	}
	
	public static void firstKey(TreeMap<Integer,String> strMap)
	{
		System.out.println("First Key: "+strMap.firstKey());
	}
	
	public static void lastKey(TreeMap<Integer,String> strMap)
	{
		System.out.println("Last Key: "+strMap.lastKey());
	}
	
	public static void reverseKeys(TreeMap<Integer,String> strMap)
	{
		System.out.println("Reverse Order of Keys: "+strMap.descendingKeySet());
	}
	
	public static void greatestKeyValue(TreeMap<Integer,String> strMap, int givenKey)
	{
		System.out.println("Greatest Key Value map: "+strMap.floorEntry(givenKey));
	}
	
	public static void greatestKey(TreeMap<Integer,String> strMap,int givenKey)
	{
		System.out.println("Greatest Key: "+strMap.floorKey(givenKey));
	}
	
	public static void portionOfTreeStrictlyLessThanGivenKey(TreeMap<Integer,String> strMap,int givenKey)
	{
		System.out.println("Portion Less than "+givenKey+" : "+strMap.headMap(givenKey));
	}
	
	public static void portionOfTreeLessThanOrEqualTo(TreeMap<Integer,String> strMap, int givenKey)
	{
		System.out.println("Portion Less than or equal to "+givenKey+" : "+strMap.headMap(givenKey, true));
	}
	
	public static void leastKeyValueMappingStrictlyGreaterThanGivenKey(TreeMap<Integer, String> strMap, int givenKey)
	{
		System.out.println("Least Key strictly greater than given key: "+strMap.higherEntry(givenKey));
	}
	
	public static void greatestKeyValueMappingStrictlyLessThanGivenKey(TreeMap<Integer,String> strMap, int givenKey)
	{
		System.out.println("Greatest Key strictly less than given key: "+strMap.lowerEntry(givenKey));
	}
	
	public static void navigableSetKeysOfMap(TreeMap<Integer, String> strMap)
	{
		Set<Integer> setOfKeys = strMap.navigableKeySet();
		System.out.println("Navigable Set of Keys: "+setOfKeys);
	}
	
	public static void removeAndGetLeastKeyValue(TreeMap<Integer, String> strMap)
	{
		System.out.println("Least Key Value map: "+strMap.pollFirstEntry());
	}
	
	public static void removeAndGetGreatestKeyValue(TreeMap<Integer, String> strMap)
	{
		System.out.println("Greatest Key Value map: "+strMap.pollLastEntry());
	}
	
	public static void getPortionOfMap(TreeMap<Integer,String> strMap,int fromKey, int toKey)
	{
		SortedMap<Integer, String> newPortion = new TreeMap<>();
		newPortion = (SortedMap<Integer, String>) strMap.subMap(fromKey, toKey);	//from index is inclusive, to index is exclusive
		System.out.println("Portion :"+newPortion);
	}
	
	public static void getPortionFromToMapInclusive(TreeMap<Integer, String> strMap,int fromKey, int toKey)
	{
		SortedMap<Integer, String> newPortion = new TreeMap<>();
		newPortion = (SortedMap<Integer, String>)strMap.subMap(fromKey, true, toKey, true);
		System.out.println("Inclusive portion: "+newPortion);	
	}
	
	public static void getPortionKeyGreaterOrEqualThanGivenValue(TreeMap<Integer, String> strMap, int fromKey)
	{
		SortedMap<Integer, String> newPortion = new TreeMap<>();
		newPortion =strMap.tailMap(fromKey);
		System.out.println("Portion with Key greater or equal than given value: "+newPortion);
	}
	
	public static void getPortionKeyGreaterThanGivenValue(TreeMap<Integer, String> strMap, int fromKey)
	{
		SortedMap<Integer, String> newPortion = new TreeMap<>();
		newPortion =strMap.tailMap(fromKey,false);
		System.out.println("Portion with Key greater than given value: "+newPortion);	
	}
	
	public static void getKeyValu(TreeMap<Integer, String> strMap, int fromKey)
	{
		System.out.println("Portion: "+strMap.ceilingEntry(fromKey));
	}
	
	public static void getKey(TreeMap<Integer, String> strMap, int fromKey)
	{
		System.out.println("Portion key: "+strMap.ceilingKey(fromKey));
	}
	
	public static void sortUsingComparator()
	{
		TreeMap<String,String> newMap = new TreeMap<String,String>(new sort_key());
		newMap.put("C2", "Red");
		newMap.put("C4", "Green");
		newMap.put("C5", "Black");
		newMap.put("C1", "White");
		
		System.out.println("Compared To: "+newMap);
	}
}

class sort_key implements Comparator<String>
{
	@Override
	public int compare(String str1, String str2)
	{
		return str1.compareTo(str2);
	}
}
