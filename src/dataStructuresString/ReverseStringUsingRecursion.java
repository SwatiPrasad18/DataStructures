package dataStructuresString;

import java.util.Arrays;

public class ReverseStringUsingRecursion {

	public static void main(String[] args)
	{
		String newStr = "Hello";
		//reverseString(newStr);
		
		reverseStringAgain(newStr,0,newStr.length()-1);
	}
	
	public static void reverseString(String str)
	{
		if(str.length()<=1||str==null)
			System.out.println(str);
		else
		{
			System.out.println(str.charAt(str.length()-1));
			reverseString(str.substring(0,str.length()-1));
		}
	}
	
	public static void reverseStringAgain(String str, int strt, int end)
	{
		char temp ;
		char[] strC =  str.toCharArray();
		
		if(strt>=end)
		{
			for(char c:strC)
			{
				System.out.println(c);
			}	
			return;
		}
		
		temp = strC[strt];
		strC[strt] = strC[end];
		strC[end] = temp;
		strt++;
		end--;
		reverseStringAgain(Arrays.toString(strC), strt, end);
	}
	
}
