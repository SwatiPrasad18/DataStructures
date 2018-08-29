package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringArrayList {

	public static void main(String args[])
	{
		String[] color =  {"Red", "Blue", "Green", "White", "Black"};
		List<String> colorList;
		colorList=addToArrayList(color);
		traverseArrayList(colorList);
		
		addToFirstPositing("Azure",colorList);
		traverseArrayList(colorList);	
		
		addToEndOfList("Gold", colorList);
		traverseArrayList(colorList);
		
		String valueAtIndex = getValueAtIndex(4,colorList);
		System.out.println("Value at Index : "+valueAtIndex);
		
		updateSpecifiedElement("Fuschia", "Green",colorList);
		traverseArrayList(colorList);
		
		removeElementFromPosition(3, colorList);
		traverseArrayList(colorList);
		
		searchElement("Black", colorList);
		
		sortCollection(colorList);
		traverseArrayList(colorList);
		
		reverseArrayList(colorList);
		copyList(colorList);
		shuffleList(colorList);
		
		subList(colorList, 1, 5);
		swapElements(colorList, 2, 5);
		
		//String[] color2 =  {"Lemon", "Quartz", "Rose", "Marsh", "White"};
		emptyList(colorList);
	}

	public static List<String> addToArrayList(String[] arrayL)
	{
		List<String> arrayList = new ArrayList<>();
		for(String s: arrayL)
		{
			arrayList.add(s);
		}
		
		return arrayList;
	}
	public static void traverseArrayList(List<String> listA)
	{
		System.out.println("Printing Collection"+listA);
		System.out.println("=========================");

		for(String c: listA)
		{
			System.out.println(c);
		}
		System.out.println("=========================");
	}

	public static List<String> addToFirstPositing(String strVal, List<String> listB)
	{
		listB.add(0, strVal);
		return listB;
	}

	public static List<String> addToEndOfList(String strAddAtEnd, List<String> listC)
	{
		int listsize = listC.size();
		listC.add(listsize-1, strAddAtEnd);
		return listC;
	}
	
	public static String getValueAtIndex(int indexVal, List<String> listD)
	{
		String val = listD.get(indexVal);
		return val;
	}
	
	public static List<String> updateSpecifiedElement(String updatedValue, String valueToUpdate, List<String> listE)
	{
		int indexVal = listE.indexOf(valueToUpdate);
		listE.set(indexVal,updatedValue);
		return listE;
	}
	
	public static List<String> removeElementFromPosition(int position, List<String> listF)
	{
		int indexToBeDeleted = position-1;
		listF.remove(indexToBeDeleted);
		return listF;
	}
	
	public static void searchElement(String stringToBeSearched, List<String> listG)
	{
		for(int i =0; i<listG.size(); i++)
		{
			if(listG.get(i).equals(stringToBeSearched))
				System.out.println("Position:"+(i+1));
		}
	}
	
	public static List<String> sortCollection(List<String> listF)
	{
		Collections.sort(listF);
		return listF;
	}
	
	public static void reverseArrayList(List<String> listH)
	{
		Collections.reverse(listH);
		System.out.println("Reverse List:"+listH);
		
	}
	
	public static void copyList(List<String> listJ)
	{
		List<String> newList = new ArrayList<>(listJ);
		//Collections.copy(newList, listJ); ---gives ArrayIndexOutOfBound error
		System.out.println("New List: "+newList);
	}
	
	public static void shuffleList(List<String> listK)
	{
		Collections.shuffle(listK);
		System.out.println("Shuffled List: "+listK);	
	}
	
	public static void subList(List<String> listL, int startIndex, int endIndex)
	{
		List<String> subString = new ArrayList<>();
		subString = listL.subList(startIndex, endIndex); // startIndex is 0 based, endIndex in 1 based
		System.out.println(subString);
	}
	
	public static void swapElements(List<String> listM, int startIndex, int endIndex)
	{
		System.out.println("Original List:"+listM);
		Collections.swap(listM, startIndex, endIndex); // startIndex and endIndex is 0 based
		System.out.println("Swapped List:"+listM);
	}
	
	public static void joinList(List<String> listN, List<String> listO)
	{
		List<String> joinedList = new ArrayList<>();
		joinedList.addAll(listN);
		joinedList.addAll(listO);
		System.out.println("Joined ArrayList: "+joinedList);
	}
	
	public static void emptyList(List<String> listP)
	{
		listP.removeAll(listP);
		System.out.println(listP);
		if(listP.isEmpty())
		{
			System.out.println("List is empty");
		}
	}

}
