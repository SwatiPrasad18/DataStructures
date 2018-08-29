package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StringHashMap {

	public static void main(String args[])
	{
		String[] month = {"Jan","Feb","Mar","Apr","May","June"};

		Map<Integer, String> monMap =  new HashMap<>();
		monMap = addToMap( monMap, month);

		traverseMap(monMap);
		getSize(monMap);
		
		copyMap(monMap);
		checkEmpty(monMap);
		
		checkKey(monMap,4);
		checkValue(monMap,"June");
		setViewOfMap(monMap);
		getValueOf(monMap,3);
		getValueOf(monMap,9);
		setOfKey(monMap);
		collectionView(monMap);
		
		removeAll(monMap);
		traverseMap(monMap);
		checkEmpty(monMap);
		
		cloneMap();
	}

	public static Map<Integer, String> addToMap(Map<Integer,String> stMap, String[] arr)
	{
		for(int i =0;i<arr.length;i++)
		{
			stMap.put(i, arr[i]);
		}
		return stMap;
	}

	public static void traverseMap(Map<Integer, String> stMap)
	{
		System.out.println("Printing Collection: "+stMap);
		System.out.println("===========================");
		for(Map.Entry<Integer,String> h:stMap.entrySet())
		{
			System.out.println("Key: "+h.getKey()+" Value: "+h.getValue());
		}
		System.out.println("===========================");
	}
	
	public static void getSize(Map<Integer,String> stMap)
	{
		System.out.println("Size of Map is: "+stMap.size());
	}
	
	public static void copyMap(Map<Integer,String> stMap)
	{
		Map<Integer,String> newMap = new HashMap<>(stMap);
		System.out.println("Copied Map "+stMap);
		
		newMap.putAll(stMap);
		System.out.println("All Items Put: "+stMap);
	}
	
	public static void removeAll(Map<Integer,String> stMap)
	{
		stMap.clear();
	}
	
	public static void checkEmpty(Map<Integer,String> stMap)
	{
		if(stMap.isEmpty())
			System.out.println("Is Empty");
		else
			System.out.println("Not Empty");
	}
	
	public static void cloneMap()
	{
		HashMap<Integer,String> stMap = new HashMap<>();
		stMap.put(1, "One");
		stMap.put(2, "Two");
		stMap.put(3, "Three");
		
		HashMap<Integer,String> newMap = new HashMap<>();
		newMap = (HashMap<Integer, String>)stMap.clone();
		
		System.out.println("Cloned Map: "+newMap);
	}
	
	public static void checkKey(Map<Integer,String> stMap, int givenKey)
	{
		if(stMap.containsKey(givenKey))
			System.out.println("Contains given key");
		else
			System.out.println("Does not contain key");
	}
	
	public static void checkValue(Map<Integer,String> stMap, String givenValue)
	{
		if(stMap.containsValue(givenValue))
			System.out.println("Contains given value");
		else
			System.out.println("Does not contain value");
	}
	
	public static void setViewOfMap(Map<Integer,String> stMap)
	{
		Set<Entry<Integer, String>> newSet = stMap.entrySet();
		System.out.println("Set values: "+newSet);
	}
	
	public static void getValueOf(Map<Integer,String> stMap, int givenKey)
	{
		if(stMap.containsKey(givenKey))
			System.out.println("Value is:"+stMap.get(givenKey));
		else
			System.out.println("Key not found");
	}
	
	public static void setOfKey(Map<Integer,String> stMap)
	{
		Set<Integer> newSet = stMap.keySet();
		System.out.println("Set of Keys: "+newSet);
	}
	
	public static void collectionView(Map<Integer,String> stMap)
	{
		System.out.println("Collection view: "+stMap.values());
	}

}
