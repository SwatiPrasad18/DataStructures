package collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class StringPriorityQueue {

	public static void main(String args[])
	{
		Queue<String> colorQueue = new PriorityQueue<>();
		String[] colors = {"Red","Blue","Green","Olive","Black"};
		
		colorQueue = addToQueue(colorQueue,colors);
		traverseQueue(colorQueue);
		copyQueue(colorQueue);
		
		numberOfElements(colorQueue);
		
		getFirstElement(colorQueue);
		
		getAndRemoveFirstElement(colorQueue);
		
		convertToArray(colorQueue);
		convertToString(colorQueue);
		
		removeAllElements(colorQueue);
		traverseQueue(colorQueue);
	} 
	
	public static Queue<String> addToQueue(Queue<String> strQueue, String[] stArray)
	{
		for(String st: stArray)
		{
			strQueue.add(st);
		}
		return strQueue;
	}
	
	public static void traverseQueue(Queue<String> strQueue)
	{
		System.out.println("Printing Collection: "+strQueue);
		System.out.println("===========================");
		for(String str: strQueue)
		{
			System.out.println(str);
		}
		System.out.println("===========================");
	}
	
	public static void copyQueue(Queue<String> strQueue)
	{
		Queue<String> newStringQueue =  new PriorityQueue<>(strQueue);
		
		System.out.println("Copied Queue: "+newStringQueue);
	}
	
	public static void numberOfElements(Queue<String> strQueue)
	{
		System.out.println("Number of Elements : "+strQueue.size());
	}
	
	public static void removeAllElements(Queue<String> strQueue)
	{
		strQueue.removeAll(strQueue);
	}
	
	public static void getFirstElement(Queue<String> strQueue)
	{
		System.out.println("First Element: "+strQueue.peek());
	}
	
	public static void getAndRemoveFirstElement(Queue<String> strQueue)
	{
		System.out.println("Get and Remove First Element: "+strQueue.poll());
	}
	
	public static void convertToArray(Queue<String> strQueue)
	{
		String[] nArray = new String[strQueue.size()];
		strQueue.toArray(nArray);
		
		System.out.println("As array: "+strQueue);
	}
	
	public static void convertToString(Queue<String> strQueue)
	{
		System.out.println("As String: "+strQueue.toString());
	}
	
	
}
