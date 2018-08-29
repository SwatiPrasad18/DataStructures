package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class StringTreeSet {

	public static void main(String[] args)
	{
		TreeSet<String> colorTreeSet =  new TreeSet<>();
		String[] colors = {"Red","Blue","Yellow","White","Gold", "Magenta"};
		
		colorTreeSet = addToTreeSet(colors);
		traverseSet(colorTreeSet);
		
		copyTreeSet(colorTreeSet);
		reverseTreeSet(colorTreeSet);
		
		getFirstElement(colorTreeSet);
		getLastElement(colorTreeSet);
		getNumberOfElements(colorTreeSet);
		
		removeFirstElement(colorTreeSet);
		removeLastElement(colorTreeSet);
		removeGivenElement(colorTreeSet,"Red");
		
		TreeSet<Integer> numSet = new TreeSet<>();
		findNumberGreaterThanGivenNumber(numSet, 7);
		
		findGreaterThanOrEqualTo(numSet,6);
		findLessThanOrEqualTo(numSet,5);
		findStrictlyGreaterThanElement(numSet,8);
		findStrictlyLessThanElement(numSet,10);
		
 	} 
	
	public static TreeSet<String> addToTreeSet(String[] strArray)
	{
		TreeSet<String> newSet = new TreeSet<>();
		for(String st:strArray)
		{
			newSet.add(st);
		}
		return newSet;
	}
	 
	public static void traverseSet(TreeSet<String> strSet)
	{
		System.out.println("Printing Collection:"+ strSet);	// printing in natural order
		System.out.println("Printing Elements");
		System.out.println("=====================");
		for(String st:strSet)
		{
			System.out.println(st);
		}
		System.out.println("=====================");
	}
	
	public static void copyTreeSet(TreeSet<String> strSet)
	{
		TreeSet<String> newSet = new TreeSet<>(strSet);
		System.out.println("Copied Set:"+newSet);
		
		newSet = (TreeSet<String>)strSet.clone();
		System.out.println("Copied Set:"+newSet);
	}
	
	public static void reverseTreeSet(TreeSet<String> strSet)
	{
		Iterator<String> it = strSet.descendingIterator();
		
		System.out.println("Printing Elements In Reverse");
		System.out.println("=====================");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("=====================");
	}
	
	public static void getFirstElement(TreeSet<String> strSet)
	{
		System.out.println("First Element:"+ strSet.first());
	}
	
	public static void getLastElement(TreeSet<String> strSet)
	{
		System.out.println("Last Element:"+strSet.last());
	}
	
	public static void getNumberOfElements(TreeSet<String> strSet)
	{
		System.out.println("Number of Elements:"+strSet.size());
	}
	
	public static void removeFirstElement(TreeSet<String> strSet)
	{
		System.out.println("Removes the First Element:"+strSet.pollFirst());
		System.out.println("TreeSet after Removal:"+strSet);
	}
	
	public static void removeLastElement(TreeSet<String> strSet)
	{
		System.out.println("Removes the Last Element:"+strSet.pollLast());
		System.out.println("TreeSet after Removal:"+strSet);
	}
	
	public static void removeGivenElement(TreeSet<String> strSet, String givenElement)
	{
		strSet.remove(givenElement);
		System.out.println("After Removal TreeSet:"+strSet);
	}
	
	public static void findNumberGreaterThanGivenNumber(TreeSet<Integer> intSet, int givenNumber)
	{
		intSet.add(1);
		intSet.add(11);
		intSet.add(4);
		intSet.add(5);
		intSet.add(18);
		intSet.add(31);
		intSet.add(9);
		
		TreeSet<Integer> newIntSet = new TreeSet<>();
		newIntSet = (TreeSet)intSet.headSet(givenNumber);
		
		Iterator itr = newIntSet.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	
	public static void findGreaterThanOrEqualTo(TreeSet<Integer> intSet, int givenNumber)
	{
		intSet.add(1);
		intSet.add(11);
		intSet.add(4);
		intSet.add(5);
		intSet.add(18);
		intSet.add(31);
		intSet.add(9);
		
		System.out.println("Greater than or equal to "+givenNumber+":="+intSet.ceiling(givenNumber));
	}
	
	public static void findLessThanOrEqualTo(TreeSet<Integer> intSet, int givenNumber)
	{
		intSet.add(1);
		intSet.add(11);
		intSet.add(4);
		intSet.add(5);
		intSet.add(18);
		intSet.add(31);
		intSet.add(9);
		
		System.out.println("Less Than or Equal To "+givenNumber+":="+intSet.floor(givenNumber));
	}
	
	public static void findStrictlyGreaterThanElement(TreeSet<Integer> intSet,int givenNumber)
	{
		intSet.add(1);
		intSet.add(11);
		intSet.add(4);
		intSet.add(5);
		intSet.add(18);
		intSet.add(31);
		intSet.add(9);
		
		System.out.println("Strictly Greater Than "+givenNumber+":"+intSet.higher(givenNumber));
	}
	
	public static void findStrictlyLessThanElement(TreeSet<Integer> intSet, int givenElement)
	{
		intSet.add(1);
		intSet.add(11);
		intSet.add(4);
		intSet.add(5);
		intSet.add(18);
		intSet.add(31);
		intSet.add(9);
		
		System.out.println("Strictly Less Than "+givenElement+":"+intSet.lower(givenElement));
	}
}
