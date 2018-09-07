package dataStructuresString;

public class PreserveSpacesAndReverseString {

	public static void main(String[] args)
	{
		String str = "My name is Bond";
		reverseString(str);
	}

	public static void reverseString(String str)
	{
		char newStrg[] =  new char[str.length()];
		char oldStrg[] = str.toCharArray();

		for(int i=0;i<str.length();i++)
		{
			if(oldStrg[i]==' ')
				newStrg[i] = ' ';
		}
		//System.out.println(String.valueOf(newStrg));
		System.out.println(String.valueOf(oldStrg)); 
		
		int j=str.length()-1;
		for(int i=0;i<str.length();i++)

		{
			if(oldStrg[i]!=' ')
			{
				if(newStrg[j] ==' ')
				{
					j--;
				}
				newStrg[j] = oldStrg[i];
				j--;
			}
		
		}
		System.out.println(String.valueOf(newStrg));
	}
}
