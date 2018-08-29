package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;


public class IntegerLinkedList {

	public static void main(String[] args)
	{
		LinkedList<Integer> integerLinkedList = new LinkedList<>();
		int intArray[] = {5,3,5,2,1};
		integerLinkedList =  addToLinkedList(intArray,integerLinkedList);
		traverseLinkedList(integerLinkedList);
		
		traverseFromGivenIndex(3, integerLinkedList);
		reverseTraverse(integerLinkedList);
		
		addAtSpecifiedPosition(4, integerLinkedList, 99);
		traverseLinkedList(integerLinkedList);
		
		addToFirstPosition(100,integerLinkedList);
		traverseLinkedList(integerLinkedList);
		
		addAtLastPosition(1, integerLinkedList);
		traverseLinkedList(integerLinkedList);
		
		getFirstOccurrence(integerLinkedList);
		getLastOccurrence(integerLinkedList);
		
		removeFromSpecifiedPosition(integerLinkedList,4);
		traverseLinkedList(integerLinkedList);
		
		removeFirstElement(integerLinkedList);
		traverseLinkedList(integerLinkedList);
		removeLastElement(integerLinkedList);
		traverseLinkedList(integerLinkedList);
		
		swapElements(integerLinkedList,2,5);
		traverseLinkedList(integerLinkedList); 
		
		shuffleLinkedList(integerLinkedList);
		traverseLinkedList(integerLinkedList);
		
		int[] array2 = {66,77,88,33,1};
		LinkedList<Integer> newList =  new LinkedList<>();
		newList = addToLinkedList(array2, newList);
		joinLisnkedLists(integerLinkedList,newList);
		
		cloneLinkedList(integerLinkedList);
		removeAndPrintFirstElement(integerLinkedList);
		
		viewHeader(integerLinkedList);
		viewTail(integerLinkedList);
		
		searchSpecifiedElement(integerLinkedList, 77);
		convertToArrayList(integerLinkedList);
		
		updateSpecifiedElement(integerLinkedList,0,4);
		traverseLinkedList(integerLinkedList);
		
		removeAllElement(integerLinkedList);
		traverseLinkedList(integerLinkedList);
		checkIfEmpty(integerLinkedList);
	} 
	
	public static LinkedList<Integer> addToLinkedList(int[] intArrayToAdd,LinkedList<Integer> integerLinkedList)
	{
		for(int i=0;i<intArrayToAdd.length; i++)
		{
			integerLinkedList.add(intArrayToAdd[i]);
		}
		return integerLinkedList;
	}
	
	public static void traverseLinkedList(List<Integer> integerLinkedList)
	{
		System.out.println("Printing Collection:"+integerLinkedList);
		System.out.println("===========================");
		for(Integer i: integerLinkedList)
		{
			System.out.println(i);
		}
		System.out.println("===========================");
		
	}
	
	public static void traverseFromGivenIndex(int givenIndex, LinkedList<Integer> intList)
	{
		Iterator<Integer> pos = intList.listIterator(givenIndex); //index is 0 based
		System.out.println("===========================");
		System.out.println("Printing from given Index");
		
		while(pos.hasNext())
		{
			System.out.println(pos.next());
		}
		System.out.println("===========================");

	}
	
	public static void reverseTraverse(LinkedList<Integer> intList)
	{
		Collections.reverse(intList);
		System.out.println(intList);
	}
	
	public static void addAtSpecifiedPosition(int givenIndex, LinkedList<Integer> intList, int valueToAdd)
	{
		intList.add(givenIndex, valueToAdd);		//index is 0 based
	}
	
	public static void addToFirstPosition(int valueToAdd, LinkedList<Integer> intList)
	{
		intList.add(0, valueToAdd);
		intList.addFirst(valueToAdd);
	}
	
	public static void addAtLastPosition(int valueToAdd, LinkedList<Integer> intList)
	{
		int lastPostition = intList.size();
		intList.add(lastPostition,valueToAdd);
		intList.addLast(valueToAdd);
		
	}

	public static void getFirstOccurrence(LinkedList<Integer> intList)
	{
		System.out.println(intList.getFirst());
	}
	
	public static void getLastOccurrence(LinkedList<Integer> intList)
	{
		System.out.println(intList.getLast());	
	}
	
	public static void removeFromSpecifiedPosition(LinkedList<Integer> intList, int givenIndex)
	{
		intList.remove(givenIndex);		//index is 0 based
	}
	
	public static void removeFirstElement(LinkedList<Integer> intList)
	{
		intList.removeFirst();
	}
	
	public static void removeLastElement(LinkedList<Integer> intList)
	{
		intList.removeLast();
	}
	
	public static void swapElements(LinkedList<Integer> intList, int firstIndex, int secondIndex)
	{
		Collections.swap(intList, firstIndex, secondIndex);		//index is 0 based
	}
	
	public static void shuffleLinkedList(LinkedList<Integer> intList)
	{
		Collections.shuffle(intList);
	}
	
	public static void joinLisnkedLists(LinkedList<Integer> intList, LinkedList<Integer> intList2)
	{
		LinkedList<Integer> joinedList = new LinkedList<>();
		joinedList.addAll(intList);
		joinedList.addAll(intList2);
		System.out.println(joinedList);
	}
	
	@SuppressWarnings("unchecked")
	public static void cloneLinkedList(LinkedList<Integer> intList)
	{
		LinkedList<Integer> newList = new LinkedList<>();
		newList=(LinkedList<Integer>)intList.clone();
		System.out.println("Cloned List:"+newList);
	}
	
	public static void removeAndPrintFirstElement(LinkedList<Integer> intList)
	{
		System.out.println("First Element:"+intList.pop());
	}
	
	public static void viewHeader(LinkedList<Integer> intList)
	{
		System.out.println("First element, not removed:"+intList.peekFirst());
	}
	
	public static void viewTail(LinkedList<Integer> intList)
	{
		System.out.println("LAstElement, not removed:"+intList.peekLast());
	}
	
	public static void searchSpecifiedElement(LinkedList<Integer> intList, int valueToBeSearched)
	{
		if(intList.contains(valueToBeSearched))
			System.out.println("Value Found");
		else
			System.out.println("Value Not Found");
	}
	
	public static void convertToArrayList(LinkedList<Integer> intList)
	{
		List<Integer> convertedList =  new ArrayList<Integer>(intList);
		System.out.println("Converted to ArrayList:");
		System.out.println("===========================");
		for(Integer i:convertedList)
		{
			System.out.println(i);
		}
		System.out.println("===========================");
	} 
	
	public static void removeAllElement(LinkedList<Integer> intList)
	{
		intList.removeAll(intList);
	}
	
	public static void checkIfEmpty(LinkedList<Integer> intList)
	{
		if(intList.isEmpty())
			System.out.println("List is empty");
		else
			System.out.println("List is not empty");
	}
	
	public static void updateSpecifiedElement(LinkedList<Integer> intList, int valueToBeUpdated, int givenIndex)
	{
		intList.set(givenIndex, valueToBeUpdated);			//index is 0 based
	}
	
}
