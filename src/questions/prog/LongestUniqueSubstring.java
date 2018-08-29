package questions.prog;


public class LongestUniqueSubstring {

	public static void main(String args[])
	{
		uniquestring("Apple");
	}

	public static void uniquestring(String str) {
		int maxLength=0;
		int lengthOf,j;
		String strResult="";
		String maxString="";
		for(int i=0;i<str.length()-1;i++)
		{
			 lengthOf=0;
			 strResult="";
			 strResult =strResult+str.charAt(i);
			for(j=i+1;j<str.length();j++)
			{

				if(strResult.indexOf(str.charAt(j))==-1)
				{
					strResult=strResult+str.charAt(j);
					lengthOf = strResult.length();
					maxLength = (lengthOf>maxLength?lengthOf:maxLength);
					//maxString = (maxString.length()>strResult.length()?maxString:strResult);
				}
			}
		}
		
		System.out.println(maxLength);
		System.out.println(strResult);
	}
}
