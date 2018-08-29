package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class StringHashSet {

	public static void main(String[] args)
	{
		String[] fruits = {"Lime","Melon","Grapefruit","Blueberry","Apple","Apple","Apricot"};
		Set<String> fruitsSet = new HashSet<>();
		fruitsSet = addToHashSet(fruits);
		traverseHashSet(fruitsSet);
		
		appendToEnd(fruitsSet, "Gooseberry");
		traverseHashSet(fruitsSet);
		getNumberOfElements(fruitsSet);
		
		cloneHashSet(fruitsSet);
		
		convertToArray(fruitsSet);
		
		convertToTreeSet(fruitsSet);
		
		convertToList(fruitsSet);
		
		retainElementsCommonToBothSets(fruitsSet);
		
		epmtyHashSet(fruitsSet);
		traverseHashSet(fruitsSet);
		checkIfEmpty(fruitsSet);
			
	}
	
	public static Set<String> addToHashSet(String[] strArray)
	{
		Set<String> newSet = new HashSet<>();
		for(String str:strArray)
		{
			newSet.add(str);
		}
		return newSet;
	}
	
	public static void traverseHashSet(Set<String> strSet)
	{
		System.out.println("Printing Collection:"+strSet);
		System.out.println("===========================");
		System.out.println("Printing Elements");
		for(String str: strSet)
		{
			System.out.println(str);
		}
		System.out.println("===========================");
	}
	
	public static void appendToEnd(Set<String> strSet, String givenValue)
	{
		strSet.add(givenValue);
	}
	
	public static void getNumberOfElements(Set<String> strSet)
	{
		System.out.println("Number of Elements:"+strSet.size());
	}
	
	public static void epmtyHashSet(Set<String> strSet)
	{
		strSet.removeAll(strSet);
		strSet.clear();
		
	}
	
	public static void checkIfEmpty(Set<String> strSet)
	{
		if(strSet.isEmpty())
			System.out.println("Hash Set is empty");
		else
			System.out.println("Hash Set is not empty");
	}
	
	public static void cloneHashSet(Set<String> strSet)
	{
		Set<String> newHashSet =  new HashSet<>(strSet);
		System.out.println("Copied Set :"+ newHashSet);
	}
	
	public static void convertToArray(Set<String> strSet)
	{
		String[] newArray = new String[strSet.size()];
		strSet.toArray(newArray);
		
		System.out.println("Converted to Array:");
		System.out.println("===========================");
		for(String str:newArray)
		{
			System.out.println(str);
		}
		System.out.println("===========================");
	}
	
	public static void convertToTreeSet(Set<String> strSet)
	{
		Set<String> newTreeSet = new TreeSet<>(strSet);
		System.out.println("Converted to TreeSet:");
		System.out.println("===========================");
		for(String str:newTreeSet)
		{
			System.out.println(str);
		}
		System.out.println("===========================");
	}
	
	public static void convertToList(Set<String> strSet)
	{
		List<String> newList = new ArrayList<>(strSet);
		System.out.println("Converted to List/ArrayList:");
		System.out.println("===========================");
		for(String str:newList)
		{
			System.out.println(str);
		}
		System.out.println("===========================");
	}
	
	public static void retainElementsCommonToBothSets(Set<String> strSet)
	{
		Set<String> newSet = new HashSet<>();
		newSet.add("Blueberry");
		newSet.add("Raspberry");
		newSet.add("Apricot");
		newSet.add("Strawberry");
		newSet.add("Grapefruit");
		
		strSet.retainAll(newSet);
		
		System.out.println("Common Elements:"+strSet);
		
	}
} 
