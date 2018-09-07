package dataStructuresArray;

import java.util.HashMap;
import java.util.Map.Entry;

public class DistinctElementsCommonToAllRowsOfAMatrix {

	public static void main(String[] args)
	{
		int[][] mat = {  {2, 1, 4, 3},
                {1, 2, 3, 2},  
                {3, 6, 2, 3},  
                {5, 2, 5, 3}  };
		distinctElements(mat);
		
		int[][] mat1 = {  {12, 1, 14, 3, 16},
                {14, 2, 1, 3, 35},  
                {14, 1, 14, 3, 11},  
                {14, 25, 3, 2, 1},
                {1, 18, 3, 21, 14}  };
		distinctElements(mat1);
	}
	
	public static void distinctElements(int[][] mat)
	{
		int row = mat.length;
		int col = mat[0].length;
		HashMap<Integer,Integer> hMap = new HashMap<>();
		for(int i=0;i<row;i++)
		{
			for(int j =0;j<col;j++)
			{
				if(hMap.containsKey(mat[i][j]))
					hMap.put(mat[i][j], hMap.get(mat[i][j])+1);
				else
					hMap.put(mat[i][j], 1);
			}	
		}
		
		System.out.println(hMap);
		System.out.println(row);
		
		
		int count =0;
		for(Entry<Integer, Integer> eSet:hMap.entrySet())
		{
			if(eSet.getValue()==row||eSet.getValue()>row)
				count++;
		}
		
		System.out.println("Count: "+count);
	}
}
